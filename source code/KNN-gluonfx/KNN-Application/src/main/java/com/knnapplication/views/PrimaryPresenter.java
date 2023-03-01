package com.knnapplication.views;

import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.knn.client.Client;
import com.knnapplication.KNNApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;


import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 * Classe che modella il presenter principale
 */
public class PrimaryPresenter {


    public void initialize() {
        primary.showingProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue) {
                AppBar appBar = AppManager.getInstance().getAppBar();
                appBar.setNavIcon(MaterialDesignIcon.MENU.button(e ->
                        AppManager.getInstance().getDrawer().open()));
                appBar.setTitleText("KNN Regressor");
                if(ExampleView.getFile() != null)
                {
                    label.setText("Sei tornato indietro. Vuoi ricaricare il file?");
                    //AppManager.getInstance().switchView(KNNApplication.EXAMPLE_VIEW); //switch ad un altro FXML
                }
            }
        });
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label label;

    @FXML
    private View primary;

    @FXML
    private VBox _input_section;


    /**
     * Inizia la comunicazione con il server utilizzando un file come training set
     * @param event
     */
    @FXML
    void LoadFile(ActionEvent event) {


        //connection to server
        InetAddress addr;
        try {
            addr = InetAddress.getByName("127.0.0.1");

        } catch (UnknownHostException e) {
            System.out.println(e.toString());
            return;
        }

        Client c;

        //provo ad istanziare la classe utente e ha utilizzare il file caricato dall'utente per poter effettuare una predizione
        //dopo aver caricato il file e l'oggetto KNN, mi sposto verso una nuova view, nella quale dovrò inserire l'esempio.
        try {
            c=new Client("127.0.0.1", 2025, label);
            //if connection is ok, then user should choose his file
            FileChooser fc = new FileChooser();
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            FileChooser.ExtensionFilter datFilter = new FileChooser.ExtensionFilter("DAT files (*.dat)", "*.dat");
            fc.getExtensionFilters().add(extFilter);
            fc.getExtensionFilters().add(datFilter);
            File file = fc.showOpenDialog(stage);
            System.out.println(file);

            //se è stato scelto un file
            if(file != null) {
                /*
                Set di tutto ciò che mi serve per iniziare a comunicare con il server.
                 */
                ExampleView.setFile(file);
                ExampleView.setClient(c);
                ExampleView.getClient().getOut().writeObject(1); //decision
                ExampleView.getClient().getOut().writeObject(file); //filename
                AppManager.getInstance().switchView(KNNApplication.EXAMPLE_VIEW); //switch ad un altro FXML
            }

        }  catch (IOException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        } catch (NumberFormatException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        } catch (ClassNotFoundException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        }


    }

    /**
     * Inizia la comunicazione con il server utilizzando un file binario come training set
     * @param event
     */
    @FXML
    void LoadBinary(ActionEvent event) {

        //connection to server
        InetAddress addr;
        try {
            addr = InetAddress.getByName("127.0.0.1");

        } catch (UnknownHostException e) {
            System.out.println(e.toString());
            return;
        }

        Client c;
        try {
            c=new Client("127.0.0.1", 2025, label);
            //if connection is ok, then user should choose his file
            FileChooser fc = new FileChooser();
            FileChooser.ExtensionFilter datFilter = new FileChooser.ExtensionFilter("DAT files (*.dat)", "*.dat");
            fc.getExtensionFilters().add(datFilter); //aggiungo un filtro al file chooser
            File file = fc.showOpenDialog(stage);

            System.out.println(file); //print in console del file scelto

            //se è stato scelto un file
            if(file != null) {
                /*
                Set di tutto ciò che mi serve per iniziare a comunicare con il server.
                 */
                ExampleView.setFile(file);
                ExampleView.setClient(c);
                ExampleView.getClient().getOut().writeObject(2); //decision
                ExampleView.getClient().getOut().writeObject(file); //filename
                AppManager.getInstance().switchView(KNNApplication.EXAMPLE_VIEW); //switch ad un altro FXML
            }

        }  catch (IOException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        } catch (NumberFormatException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        } catch (ClassNotFoundException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        }


    }

    /**
     * Inizia la comunicazione con il server utilizzando il DB per caricare il training set
     * @param event
     */
    @FXML
    void LoadDB(ActionEvent event) {
        //connection to server
        InetAddress addr;
        try {
            addr = InetAddress.getByName("127.0.0.1");

        } catch (UnknownHostException e) {
            System.out.println(e.toString());
            return;
        }

        Client c;
        try {
            c=new Client("127.0.0.1", 2025, label);

                /*
                Set di tutto ciò che mi serve per iniziare a comunicare con il server.
                 */
                ExampleView.setClient(c);
                ExampleView.getClient().getOut().writeObject(3); //decision
                ExampleView.getClient().getOut().writeObject("provac"); //filename
                AppManager.getInstance().switchView(KNNApplication.EXAMPLE_VIEW); //switch ad un altro FXML

        }  catch (IOException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        } catch (NumberFormatException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        } catch (ClassNotFoundException e) {
            label.setText(e.toString());
            System.out.println(e.toString());
            return;
        }

    }
}