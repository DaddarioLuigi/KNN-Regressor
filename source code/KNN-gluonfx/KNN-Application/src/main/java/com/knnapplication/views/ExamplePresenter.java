package com.knnapplication.views;

import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.TextField;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.knnapplication.KNNApplication;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.net.SocketException;

/**
 * Classe per il presenter di Example, con questa viene mostrata la view per l'inserimento dell'esempio
 */
public class ExamplePresenter   {

    @FXML
    private View exampleView;

    boolean check=false;
    @FXML
    private Button send_sample;

    @FXML
    private Button start_example;

    @FXML
    private TextField sample_prompt;

    int count;

    @FXML
    private Button back_backup;

    @FXML
    private Button ricomincia;


    @SuppressWarnings("removal")
    public void initialize() {

        exampleView.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = AppManager.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e ->
                        AppManager.getInstance().getDrawer().open()));
                appBar.setTitleText("Inserisci esempio:");

                /*
                Inizializzo variabili e visibilità degli elementi nella view
                 */
                count=2;
                send_sample.setVisible(true);
                send_sample.setText("Invia");
                sample_prompt.setVisible(true);
                ricomincia.setVisible(false);
                back_backup.setVisible(false);
                /*
                FINE inizializzazione
                 */

                try {
                    if(ExampleView.getClient().getIn().readObject().toString().equals("@STARTREADING"))
                    {
                        label.setText("Inizio inserimento esempio...");
                        Thread.sleep(100);
                        if(ExampleView.getClient().getIn().readObject().toString().equals("@READSTRING") || ((ExampleView.getClient().getIn().readObject().toString().equals("@READOUBLE"))))
                        {
                            label.setText("Inserisci valore discreto: ");
                        }
                    }
                } catch (IOException e) {
                    label.setText("Errore nel file. Torna indietro.");
                    back_backup.setVisible(true);
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    label.setText("Class not found");
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    label.setText("Timeout");
                    throw new RuntimeException(e);
                }
            }
           //new appThread(label);

        });

    }


    @FXML
    private VBox _input_section;


    @FXML
    private Label label;



    /**
     * Gestisce l'evento click del pulsante "send_sample" per inviare l'esempio al server
     * @param event
     * @throws IOException
     * @throws InterruptedException
     * @throws ClassNotFoundException
     * @throws NumberFormatException
     */
    @FXML
    void sendExample(ActionEvent event) throws IOException, InterruptedException, ClassNotFoundException, NumberFormatException {

        Service<String> service = new Service<String>() {
            @Override
            protected Task<String> createTask() {

                return new Task<String>() {

                    //con questa funzione devo effettuare la chiamata al server, chiedendo l'esempio (input/output stream)
                    @Override
                    protected String call() throws Exception {
                        String example_item = ExampleView.getClient().getIn().readObject().toString();
                        return example_item;
                    }

                };


            }

        };

        service.setOnSucceeded(e -> {

                //CONVERT IN CASE
               // double d=Double.parseDouble(service.getValue());
                if(service.getValue().equals("@READSTRING"))
                {
                    label.setText("Inserisci valore discreto: ");

                }
                else if(service.getValue().equals("@READOUBLE"))
                {
                    label.setText("Inserisci valore continuo: ");
                }
                else if(service.getValue().equals("@ENDEXAMPLE"))
                {
                    count=0;
                    label.setText("Fine inserimento esempio.");
                    AppManager.getInstance().getAppBar().setTitleText("Fine inserimento esempio");
                    sample_prompt.setVisible(false);
                    sample_prompt.setText("1");
                    send_sample.setText("OK");
                    try {
                        ExampleView.getClient().getOut().writeObject(1);
                        return;
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                else if(service.getValue().equals("Inserisci valore k>=1:"))
                {
                    AppManager.getInstance().getAppBar().setTitleText("Inserimento K");
                    label.setText("Inserisci valore k>=1: ");
                    send_sample.setText("Ottieni predizione");
                    sample_prompt.setVisible(true);
                }
               else if(Double.parseDouble(service.getValue()) >= 0) //if it is a number
                {
                    AppManager.getInstance().getAppBar().setTitleText("Predizione");
                    label.setText("Prediction: " + service.getValue());
                    send_sample.setVisible(false);
                    sample_prompt.setVisible(false);
                    ricomincia.setVisible(true);
                }
               else label.setText(service.getValue());
        });

        service.start();


           try
           {
               ExampleView.getClient().getOut().writeObject(sample_prompt.getText());
               sample_prompt.setText("");
               AppManager.getInstance().getAppBar().setTitleText("Esempio " + count);
               count++;

           } catch(SocketException e)
           {
               label.setText("Errore nella socket. Ricomincia.");
               AppManager.getInstance().switchView(KNNApplication.PRIMARY_VIEW); //switch alla view primaria
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
               label.setText("Array out of bound");
               AppManager.getInstance().switchView(KNNApplication.PRIMARY_VIEW);
           }

        }


    //}

    /**
     * Invia un messaggio al server per far partire l'inserimento
     * @param event
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws InterruptedException
     */
    @FXML
    void startExample(ActionEvent event) throws IOException, ClassNotFoundException, InterruptedException{
        ExampleView.getClient().getOut().writeObject(1); //patching problem with ENDEXAMPLE
    }


    /**
     * Ritorna alla view principale
     * @param event
     */
    @FXML
    void backHome(ActionEvent event) {
        AppManager.getInstance().switchView(KNNApplication.PRIMARY_VIEW); //switch ad un altro FXML
    }

}