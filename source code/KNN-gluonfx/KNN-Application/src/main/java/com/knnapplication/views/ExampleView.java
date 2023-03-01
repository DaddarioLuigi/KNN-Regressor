package com.knnapplication.views;

import com.gluonhq.charm.glisten.mvc.View;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import com.knn.client.Client;
import javafx.fxml.FXMLLoader;

public class ExampleView  {

    private static File dataset;
    private static Client client;

    //setter for client
    public static void setClient(Client curr_client)
    {
        client = curr_client;
    }

    //getter for client
    public static Client getClient()
    {
        return client;
    }

    //setter for file attribute
    public static void setFile(File file)
    {
      dataset = file;
    }

    //getter for file attribute
    public static File getFile()
    {
        return dataset;
    }

    public static void setFileNull()
    {
        dataset=null;
    }

    public static View getView() {
        try {
            View view = FXMLLoader.load(PrimaryView.class.getResource("exampleView.fxml"));
            return view;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            return new View();
        }
    }
}
