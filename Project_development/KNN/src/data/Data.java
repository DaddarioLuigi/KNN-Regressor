package data;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;



/*
 * 
 * Classe di modellazione del training SET
 * 
 */

public class Data {
	
	private List<Example> data;
	private List<Double> target;
	private List<Double> key;
	private int numberOfExamples;
	private List<Attribute> explanatorySet;
	private ContinuousAttribute classAttribute;

	
	@SuppressWarnings("deprecation")
	public Data(String fileName)throws FileNotFoundException, TrainingDataException {
		
		  File inFile = new File (fileName);

		  Scanner sc = new Scanner (inFile);
	      String line = sc.nextLine();
	      if(!line.contains("@schema"))
	    	  throw new TrainingDataException("Errore nello schema");
	      String s[]=line.split(" ");

		  //popolare explanatory Set 
	  	  explanatorySet = new Vector<Attribute>(s[1].length());
		  short iAttribute=0;
	      line = sc.nextLine();
	      while(!line.contains("@data")){
	    	  s=line.split(" ");
	    	  if(s[0].equals("@desc"))
	    	  { // aggiungo l'attributo allo spazio descrittivo
		    		//@desc motor discrete 
	    		  explanatorySet.add(iAttribute, new DiscreteAttribute(s[1], iAttribute));
		      }
	    	  else if(s[0].equals("@target"))
	    			  classAttribute=new ContinuousAttribute(s[1], iAttribute);

	    			  
	    	  iAttribute++;
	    	  line = sc.nextLine();
	    	  
	      }
		      
		  //avvalorare numero di esempi
	       numberOfExamples=new Integer(line.split(" ")[1]);
	      
	       
	      //popolare data e target
	      data= new Vector<Example>(numberOfExamples);
	      target= new Vector<Double>(numberOfExamples);
	      
	      
	      short iRow=0;
	      while (sc.hasNextLine())
	      {
	    
	    	 Example e=new Example();
	    	  line = sc.nextLine();
	    	  // assumo che attributi siano tutti discreti
	    	  s=line.split(","); //E,E,5,4, 0.28125095
	    	  for(short jColumn=0;jColumn<s.length-1;jColumn++)
	    		  e.getExample().add(jColumn,s[jColumn]);
	    	  data.add(iRow, e);
	    	  target.add(iRow, new Double(s[s.length-1]));
	    	  iRow++;
	    	  
	      }
		    sc.close();


	}
	

	
	/*
	 * INPUT: null
	 * OUTPUT: intero, numero degli elementi del campo explanatorySet
	 * SCOPO: Scoprire il numero di elementi del campo suddetto
	 * 
	 */
	public int getNumberOfExplanatoryAttributes()
	{
		return explanatorySet.size();
	}
	

	
	/*
	 * Partiziona data rispetto all'elemento x di key e restiutisce il punto di separazione
	 */
	private  int partition(List<Double> key, int inf, int sup){
		int i,j;
	
		i=inf; 
		j=sup; 
		int	med=(inf+sup)/2;
		
		Double x=key.get(med);
		
		data.get(inf).swap(data.get(med));
		
		double temp=target.get(inf);
		target.set(inf, target.get(med));
		target.set(med, temp);
		
		temp = key.get(inf);
		key.set(inf, key.get(med));
		key.set(med, temp);
		
		while (true) 
		{
			
			while(i<=sup && key.get(i)<=x){ 
				i++; 
				
			}
		
			while(key.get(j)>x) {
				j--;
			
			}
			
			if(i<j) { 
				
				data.get(i).swap(data.get(j));
				temp=target.get(i);
				target.set(i, target.get(j));
				target.set(j, temp);
				
				temp = key.get(i);
				key.set(i, key.get(j));
				key.set(j, temp);
				
				
			}
			else break;
		}
		
		data.get(inf).swap(data.get(j));
		
		temp=target.get(inf);
		target.set(inf, target.get(j));
		target.set(j, temp);
		
		temp=key.get(inf);
		key.set(inf, key.get(j));
		key.set(j, temp);
		
		return j;

	}
	
	/*
	 * Algoritmo quicksort per l'ordinamento di data 
	 * usando come relazione d'ordine totale "<=" definita su key
	 * @param A
	 */
	private void quicksort(List<Double> key, int inf, int sup)
	{
		
		if(sup>=inf){
			
			int pos;
			
			pos=partition(key, inf, sup);
					
			if ((pos-inf) < (sup-pos+1)) 
			{
				quicksort(key, inf, pos-1); 
				quicksort(key, pos+1,sup);
			}
			else
			{
				quicksort(key, pos+1, sup); 
				quicksort(key, inf, pos-1);
			}
			
			
		}
		
	}
	
	
	public static void main(String args[])throws FileNotFoundException{
		
		try
		{
			Data trainingSet=new Data("servo.dat");
			System.out.println(trainingSet);	
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * INPUT: Array di double
	 * OUTPUT: double: media degli elementi 
	 * SCOPO: Calcolare la media degli elementi di un array di double
	 */
	private double ArrayAvg(double kMeansDistances[], int k)
	{
		double sum = 0;
		
		for(int i=0;i<k;i++)
		{
			sum=sum+kMeansDistances[i];
		}
		
		
		return (sum/k);
	}
	
	
	
	/*
	 *  
	 * 1) Avvalora key con le distanze calcolate tra ciascuna istanza di Example memorizzata in data
		ed e (usare il metodo distance di Example)
		2) ordina data, target e key in accordo ai valori contenuti in key (usare quicksort)
		3) identifica gli esempi di data che sono associati alle k distanze più piccole in key
		4) calcola e restituisce la media dei valori memorizzati in target in corrispondenza degli esempi isolati al punto 3
	 * 
	 */
	public double avgClosest(Example e, int k)
	{
		
		double kMeansDistances[] = new double[k];
		int pos=0;
		//key = new ArrayList(data.size());
		key = new Vector<Double>(data.size());
		
		//eccezione nel caso in cui il numero di attributi sia diverso dalla dimensione di example
		
		
		//avvaloramento di key con le distanze
		for(int i=0;i<data.size();i++)
		{
			key.add(i, data.get(i).distance(e)); 
		}
		
		
		//utilizzo due variabili per il debug fatto in data 01/06/2022 in Via principe amedeo 292
		quicksort(key,0,key.size()-1);

		
		//identifico gli esempi 
		for(int i=0;i<k;i++)
		{
			kMeansDistances[i] = key.get(i);
		}
		
	
		
		return ArrayAvg(kMeansDistances,k);
		
	

	}
	
	
	
	

}
