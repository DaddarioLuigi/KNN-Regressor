/**
 *  package per le funzioni di mining 
 */
package mining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import data.Data;
import example.Example;
import utility.Keyboard;

/**
 * Realizza le funzioni per il calcolo delle predizioni da file/db/file binario
 * @author Luigi Daddario
 *
 */
public class KNN implements Serializable {
	

	private static Data data;
	
	/**
	 * Inizializza il training set
	 */
	public KNN(Data trainingSet)
	{
		data = trainingSet;
	}
	
	

	/**
	 * Lo scopo è predire il valore target utilizzando l'esempio ricevuto da tastiera come input
	 * @param trainingSet
	 * @return
	 */
	public Double predict(Data trainingSet)
	{
		Example e = trainingSet.readExample(); //lettura esempio
		int k=0;
		do {
			System.out.print("Inserisci valore k>=1:");
			k=Keyboard.readInt(); 
		}
		while (k<1);
		
		return trainingSet.avgClosest(e, k);
	}
	
	
	/**
	 * Predice il valore target dell'esempio ricevuto via tastiera da un client
	 * @param out
	 * @param in
	 * @return predizione
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws ClassCastException
	 */
	public double predict (ObjectOutputStream out, ObjectInputStream in) throws IOException, ClassNotFoundException, ClassCastException
	{
		Example e = data.readExample(out,in);
		//out.writeObject("@ENDEXAMPLE");
		int k=0;
		out.writeObject("Inserisci valore k>=1:");
		k=Integer.valueOf(in.readObject().toString()); //leggi val di K
		
			
		return data.avgClosest(e, k);
	}
	
	
	/**
	 * Predice il valore target dell'esempio ricevuto via tastiera
	 * @return predizione
	 */
	public Double predict()
	{
		Example e = data.readExample();
		int k=0;
		do {
			System.out.println("Inserisci valore k>=1: ");
			k=Keyboard.readInt();
		}
		while(k<1);
		
		return data.avgClosest(e, k);
	}
	

	//escluso da javadoc
	public Data fit(Data train, Data trainingSet)
	{
		Double prediction;
		for(int i=0;i<trainingSet.getData().size();i++)
		{
			prediction = trainingSet.avgClosest(trainingSet.getData().get(i), 2);
			trainingSet.getTarget().set(i, prediction);
		}
		
		 return train;
	}
	

	/**
	 * Serializza l'oggetto KNN
	 * @param nomeFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void salva(String nomeFile) throws FileNotFoundException,IOException {
		 
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeFile));
		out.writeObject(this);
		out.close();
	}
	
	
	/**
	 * Deserializza un oggetto salvato su un file
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static KNN carica(String file) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		KNN n=(KNN)in.readObject();
		//KNN.data = (Data) in.readObject();
		in.close();
		return n;
	}



}
