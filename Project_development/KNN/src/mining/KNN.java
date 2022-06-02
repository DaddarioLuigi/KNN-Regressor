package mining;

import data.Data;
import data.Example;
import utility.Keyboard;

public class KNN {
	
	private Data data;
	
	//costruttore
	public KNN(Data trainingSet)
	{
		data = trainingSet;
	}
	
	/*
	 * INPUT: Esempio e, k elementi (intero)
	 * OUTPUT: Double -> valore predetto
	 * SCOPO: Predice il valore target dell’esempio passato come parametro
	 */
	public Double predict(Example e, int k)
	{
		return data.avgClosest(e, k);
	}
	
	
	/*
	 * INPUT: nulla, lo devo leggere da tastiera
	 * OUTPUT: Double -> valore predetto
	 * SCOPO: Predice il valore target dell’esempio ricevuto via tastiera
	 */
	public Double predict()
	{
		Example e = new Example();
		Keyboard k = new Keyboard();
		
		
		for(int i=0;i<data.getNumberOfExplanatoryAttributes();i++)
		{
			System.out.println("Inserisci attributo numero: " + i);
			String attribute = k.readString();
			e.set(attribute);
			
		}
		
		System.out.println("Inserisci numero di k");
		int num_vicini = k.readInt();
		
		
		return data.avgClosest(e, num_vicini);
	}


}
