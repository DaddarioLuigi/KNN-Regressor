package data;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.mysql.cj.x.protobuf.MysqlxCrud.Column;


import database.DbAccess;
import database.InsufficientColumnNumberException;
import database.TableSchema;
import example.Example;
import utility.Keyboard;



/**
 * Classe di modellazione del training SET
 * 
 */
public class Data {
	
	/**
	 * 
	 */

	private List<Example> data;
	private List<Double> target;
	private List<Double> key;
	private int numberOfExamples;
	private List<Attribute> explanatorySet;
	private ContinuousAttribute classAttribute;


	/**
	 * Lo scopo è quello di costruire l'oggetto data che rappresenta
	 * il training set, utilizzando come
	 * @param filename di tipo String
	 */
	@SuppressWarnings("deprecation")
	public Data(String fileName)throws FileNotFoundException, TrainingDataException,InvocationTargetException {
		
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
	    		  if(s[s.length-1].equals("discrete")) //se discreto
	    			  explanatorySet.add(iAttribute, new DiscreteAttribute(s[1], iAttribute));
	    		  else if(s[s.length-1].equals("continuous")) //se continuo
	    			  explanatorySet.add(iAttribute, new ContinuousAttribute(s[1], iAttribute));
	    		  else explanatorySet.add(iAttribute, new DiscreteAttribute(s[1], iAttribute));
	
	    		 
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
	    	    while (sc.hasNextLine())
	  	      {
	  	    	 Example e=new Example();
	  	    	  line = sc.nextLine();
	  	    	  // assumo che attributi siano tutti discreti
	  	    	  s=line.split(","); //E,E,5,4, 0.28125095
	  	    	  for(short jColumn=0;jColumn<s.length-1;jColumn++) 
	  	    	  {
	  	    		  e.getExample().add(jColumn,s[jColumn]);
	  	    		try
	  	    		 {
	  	    			 Double e_value = Double.parseDouble(s[jColumn]);
	  	    			 ContinuousAttribute a = (ContinuousAttribute) explanatorySet.get(jColumn);
	  	    			
	  	    			  if(a instanceof ContinuousAttribute)
	  	    			  {
	  	    				 a.setMin(e_value); 
	  	    				 a.setMax(e_value);
	  	    			  }
		  	    		  
	  	    		 }catch(Exception InvocationTargetException)
	  	    		 {
	  	    			 //System.out.println(InvocationTargetException);
	  	    		 }
	  	    		
	  	    	   }
	  	    		  
	  	    	  data.add(iRow, e);
	  	    	  target.add(iRow, new Double(s[s.length-1]));
	  	    	  iRow++;
	  	    	 
	  	    	  
	  	      }
		    sc.close();
	}
	
	
	/**
	 * getter della List<Double> target
	 */
	public List<Double> getTarget()
	{
		return target;
	}
	

	/**
	 * Lo scopo è contare il numero di esempi presenti sul db, avendo come
	 * @param db di tipo DB, access e tableName di tipo Stringa che indica la tab del db ha come
	 * @return un int, numero di righe del db (num. di esempi)
	 */
	public int getNExampleDB(DbAccess db, String tableName) throws SQLException
	{
		int number_of_examples=0;
		Statement statement = db.getConnection().createStatement();
		ResultSet get_count = statement.executeQuery("SELECT * FROM " + tableName + " WHERE 1");
		
		//non conto con count perchè ho problemi con SQLException "before start..."
		while(get_count.next()) //conto il numero di esempi
			number_of_examples++;
		
		return	number_of_examples;
	}


	/**
	 * Lo scopo è quello di avvalorare explanatorySet avendo come
	 * @param db -> accesso al db e table name -> String che indica la tabella del db
	 */
	public void setExplanatorySet(DbAccess db, String tableName) throws SQLException, InsufficientColumnNumberException
	{
		Statement statement = db.getConnection().createStatement();
		ResultSet result_query_all = statement.executeQuery("SELECT * FROM " + tableName + " WHERE 1");
		TableSchema tschema = new TableSchema(tableName,db);
		Iterator<database.Column> it= tschema.iterator();
		short iAttribute=0;

				//scorro tutte le colonne del db
				for(database.Column c:tschema)
				{
					//ma finche' non trovo la colonna C che assumo sia il target
					if(c.getColumnName() != "C")
					{
						//se � un numero allora e' un attributo continuo, altrimenti e' discreto
						if(c.isNumber())
							explanatorySet.add(iAttribute, new ContinuousAttribute(c.getColumnName(), iAttribute));
						else explanatorySet.add(iAttribute, new DiscreteAttribute(c.getColumnName(), iAttribute));
							
					}
					else classAttribute=new ContinuousAttribute(c.getColumnName(), iAttribute);
					
					iAttribute++;
				}
			

	}
	
	
	
	/**
	 * 
	 * costruttore modificato al fine di avere un costruttore di data a partire da una tabella sul DB
	 * @param db
	 * @param tableName
	 * @throws TrainingDataException
	 * @throws InsufficientColumnNumberException
	 * @throws SQLException
	 */
	public Data(DbAccess db, String tableName)throws TrainingDataException, InsufficientColumnNumberException, SQLException
	{
		
		Statement statement = db.getConnection().createStatement();
		String query = "SELECT * FROM " + tableName + " WHERE 1";
		
		ResultSet result_query_all = statement.executeQuery(query);
		TableSchema tschema = new TableSchema(tableName,db);
		Iterator<database.Column> it= tschema.iterator();
		double target_val = 0.0;
		
		explanatorySet = new Vector<Attribute>(getNExampleDB(db,tableName));
	
		//popolare explanatory Set 
	  	setExplanatorySet(db, tableName);
		
	  	
		//avvalorare numero di esempi
		numberOfExamples=getNExampleDB(db,tableName);
		
		
		//popolare data e target
	    data= new Vector<Example>(numberOfExamples);
	    target= new Vector<Double>(numberOfExamples);
		
	    short iRow=0;
	    int i;
		while(result_query_all.next())
		{
		
			i=0;
			Example e = new Example();
			for(database.Column c:tschema)
			{
			
				    //finche' la colonna che trovo e' diversa dalla colonna target
					if(c.isNumber())
						e.getExample().add(result_query_all.getDouble(i+1));
					else e.getExample().add(result_query_all.getString(i+1)); 
				
				try
 	    		 {
	
					Double e_value = Double.parseDouble(result_query_all.getString(i+1));
	 	    		ContinuousAttribute a = (ContinuousAttribute) explanatorySet.get(i);
 	    			
	 	    			 
 	    			  if(a instanceof ContinuousAttribute)
 	    			  {
 	    				 a.setMin(e_value); 
 	    				 a.setMax(e_value);
 	    			  }
					
	  	    		  
 	    		 }catch(Exception InvocationTargetException)
 	    		 {
 	    			 //System.out.println(InvocationTargetException); //stampa NumberFormatException
 	    		 }
				
		
  	    	  i++;
			}
			data.add(iRow, e);
	    	target.add(iRow, result_query_all.getDouble(tschema.target().getColumnName())); //valore della colonna target (vedi tschema)
			iRow++;
		}
		
		}
	
		

	
	/**
	 * Scoprire il numero di elementi dell'attributo explanatorySet
	 * @return size dell'explanatorySet
	 */
	public int getNumberOfExplanatoryAttributes()
	{
		return explanatorySet.size();
	}
	

	/**
	 * 
	 * @return data
	 */
	public List<Example> getData()
	{
		return data;
	}
	
	/**
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
	
	/**
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
	
	

	/**
	 * 
	 * @param kdistances
	 * @param k
	 * @return la media degli elementi di un array di double
	 */
	private double ArrayAvg(double kdistances[], int k)
	{
		double sum = 0;
		
		for(int i=0;i<k;i++)
		{
			sum=sum+kdistances[i];
		}
		
		
		return (sum/k);
	}
	
	
	
	
	/**
	 * 
	 * @param e
	 * @param k
	 * @return la media dei valori mememorizzati in target in corrispondenza degli esempi isolati
	 */
	public double avgClosest(Example e, int k)
	{
		
		
		//che succede se il valore in input ha max > max o min < min? 
		e = scaledExample(e); //scalo subito l'esempio 
		
		double kdistances[] = new double[k];
		int pos=0;
	
		key = new Vector<Double>(data.size());
		
		
		/*
		 * Inizializzo la distanza poichè nel caso di variabili indipendenti miste 
		 * dovrò applicare hamming per le discrete e minmaxscaler + 1 distanza
		 * per le variabili continue
		 */
		double distance=0.0;
		
		//avvaloramento di key con le distanze
		for(int i=0;i<data.size();i++)
		{
			key.add(i, scaledExample(data.get(i)).distance(e)); //aggiungo la distanza ma considerando l'esempio scalato
		}
			
		//ordinamento del set
		quicksort(key,0,key.size()-1);
			
		//identifico gli esempi 
		for(int i=0;i<k;i++)
		{
			kdistances[i] = target.get(i);
		}
		
		return ArrayAvg(kdistances,k);

	}


	/**
	 * Lo scopo è quello di leggere un esempio da tastiera
	 * @return e -> esempio
	 */
	@SuppressWarnings("deprecation")
	public Example readExample() {
		
		Example e =new Example(getNumberOfExplanatoryAttributes());
		
		int i=0;
		for(Attribute a:explanatorySet)
		{
			if(a instanceof DiscreteAttribute) {
			System.out.print("Inserisci valore discreto X["+i+"]:");
			e.set(Keyboard.readString(),i);
		}
		else {
			double x=0.0;
		do{
			System.out.print("Inserisci valore continuo X["+i+"]:");
			x=Keyboard.readDouble();
		}
			while(new Double(x).equals(Double.NaN));
			e.set(x,i);
			}
			
		i++;
		}
		return e;
	}
	

	
	/**
	 * 
	 * Lo scopo è quello di leggere un esempio dal client
	 * @param out
	 * @param in
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws ClassCastException
	 */
	@SuppressWarnings("removal")
	public Example readExample(ObjectOutputStream out, ObjectInputStream in) throws IOException, ClassNotFoundException, ClassCastException{
		
		
		out.writeObject("@STARTREADING");
		
		Example e =new Example(getNumberOfExplanatoryAttributes());
		

			int i=0;
			for(Attribute a:explanatorySet)
			{
				
				if(a instanceof DiscreteAttribute) {

				out.writeObject("@READSTRING"); //faccio capire al client che voglio un carattere
				//out.writeObject("Inserisci valore discreto X["+i+"]:");
				e.set(in.readObject().toString(), i);
			}
			else {
				
				double x=0.0;
			do{
				out.writeObject("@READOUBLE");
				//out.writeObject("Inserisci valore continuo X["+i+"]:");
				x=Double.valueOf(in.readObject().toString());
			}
				while(new Double(x).equals(Double.NaN));
				e.set(x,i);
			}
				
			i++;
			}
		
	
		//out.writeObject("@ENDEXAMPLE"); //not sure
		
		return e;
	}
	 




/**
 * Lo scopo è scalare un esempio con MinMaxScaler
 * @param e
 * @return e -> esempio scalato 
 */
public Example scaledExample(Example e)
{
	
	double scaled;
	int pos;
	Example e_scaled = new Example();
	for(int i=0;i<e.getSize();i++)
	{

		
		//DOUBLE-CONTINUOUS STRING-CONTINUOUS
		if((e.get(i) instanceof Double) && (explanatorySet.get(i) instanceof ContinuousAttribute))
		{
			//se e.get(i) prende un elemento string, devo tentare il parse.
			scaled = ((ContinuousAttribute) explanatorySet.get(i)).scale((Double) e.get(i));
			e_scaled.getExample().add(scaled);
		
		}
		else if((e.get(i) instanceof String) && (explanatorySet.get(i) instanceof ContinuousAttribute))
		{
			double parsed_element = Double.parseDouble(e.get(i).toString());
			//check
			scaled = ((ContinuousAttribute) explanatorySet.get(i)).scale(parsed_element);
			e_scaled.getExample().add(scaled);
		}
		else
		{
			e_scaled.getExample().add(e.get(i));
		}

	}
	

	return e_scaled;
}
	

}
