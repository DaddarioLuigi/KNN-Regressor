package server;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import data.Data;
import data.TrainingDataException;
import database.DatabaseConnectionException;
import database.DbAccess;
import database.InsufficientColumnNumberException;
import example.Example;
import mining.KNN;

/**
 * Classe che modella la comunicazione client-server
 * @author Luigi Daddario
 *
 */
public class ServerOneClient extends Thread {

  private Socket socket;
  private ObjectInputStream in ;
  private ObjectOutputStream out;
  
  /**
   * Costruttore
   * @param s
   * @throws IOException
   */
  public ServerOneClient(Socket s) throws IOException {
    socket = s;
    out = new ObjectOutputStream(socket.getOutputStream()); in = new ObjectInputStream(socket.getInputStream());

    start(); // Chiama run()
  }

  
  /**
   * Run del server per la gestione di un client
   */
  public void run() {
    try {

      Runtime.getRuntime().exec("cmd /c cls");
      System.out.println("Connection granted! " + this.socket);

      while (true) {

        Object str = in .readObject();
        if (str.equals("END")) break;
        double prediction;
        String c;

        //(1) DECISION
        if (str.equals(1)) {

          //table name
          str = in.readObject().toString();

          do {
        	  
        	//(2) Creating training set
            Data data = new Data(str.toString());

        	//(3) Prediction
            KNN c_prediction = new KNN(data); //creo oggetto KNN
            
            prediction = c_prediction.predict(out, in); //effective prediction
            try {
            	c_prediction.salva("knn_serialized.dat");
            }catch(IOException exc) {System.out.println(exc.getMessage());}

            out.writeObject(prediction); //send prediction

            c = in .readObject().toString();

          } while (c.toLowerCase().equals("y"));

        }
        else if(str.equals(2))
        {
        
        	//table name
            str = in.readObject().toString();


            do {

              //(3) Prediction
             // KNN c_prediction = null; //creo oggetto KNN
              
              KNN c_prediction = KNN.carica(str.toString());
              prediction = c_prediction.predict(out, in); //effective prediction
              
              out.writeObject(prediction); //send prediction

              c = in .readObject().toString();

            } while (c.toLowerCase().equals("y"));

    
        }
        else if (str.equals(3))
        {
        	
        	System.out.println("Caricamento training set da DB...In attesa del nome della tabella");
        	
        	
            //table name
            str = in.readObject().toString();

            do {
            	
            DbAccess db=new DbAccess();
             
             //(2) Creating training set
             Data data = new Data(db, str.toString());
             
             //(3) Prediction
             KNN c_prediction = new KNN(data); //creo oggetto KNN
             
              prediction = c_prediction.predict(out, in); //effective prediction

              out.writeObject(prediction); //send prediction

              c = in.readObject().toString();

              try
              {
            	  c_prediction.salva("knn_serialized.dat");
              }catch(IOException exc) {System.out.println(exc.getMessage());}
              
            } while (c.toLowerCase().equals("y"));         
        }

      }

      System.out.println("closing...");
     

    } catch (IOException e) {

      System.err.println("IO Exception");
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (TrainingDataException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InsufficientColumnNumberException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (DatabaseConnectionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    finally {
      try {
        socket.close();
      } catch (IOException e) {
        System.err.println("Socket not closed");
      }
    }
  }

}