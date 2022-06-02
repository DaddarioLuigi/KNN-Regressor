package application;


import javafx.application.Application;
import data.Data;
import mining.KNN;
import data.Example;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.io.FileNotFoundException;
import data.TrainingDataException;
import data.ExampleSizeException;

import data.Data;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Example e=new Example();
		e.set("A");
		e.set("B");
		//Data trainingSet= new Data("servo.dat");
		try
		{
			Data trainingSet= new Data("C:/Users/info/eclipse-workspace/KNN/src/application/simple.dat");
			KNN knn=new KNN(trainingSet);
			System.out.println("Prediction with K=1:"+knn.predict(e, 1));
			System.out.println("Prediction with K=2:"+knn.predict(e, 2));
			System.out.println("Prediction with K=3:"+knn.predict(e, 3));
			System.out.println("Prediction with K=4:"+knn.predict(e, 4));
			System.out.println("Prediction with K=4:"+knn.predict());
			
		} 
		catch(Exception eTraining)
		{
			eTraining.printStackTrace(); 
		}
		
	
		launch(args);
	}
}
