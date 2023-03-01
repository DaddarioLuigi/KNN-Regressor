package data;

import java.util.Vector;

import example.Example;

//escludo questa classe dal javadoc perchè è una classe in costruzione

public class TrainTestSplit {
	
	private Data train;
	private Data test;
	private double _test_size;
	private Vector<Data> splitted_values;
	
	//costruttore: inizialmente dataset, train e test hanno la stessa dimensione
	TrainTestSplit(Data data, double test_size)
	{
		this.train=data;
		if((test_size < 0.1) || test_size > 0.9)
			_test_size = 0.5; //se il parametro non e' compreso tra il 10% e il 99%, allora imposto un valore al 50%, di default;
		else _test_size = test_size;
		
		splitted_values = new Vector<Data>(2); //dimensione 2 perche' 1 una per i test e 1 per i train
	}
	
	/*
	 * INPUT: null
	 * OUTPUT: ritorna un vettore 
	 * SCOPO: lo scopo  e' quello di dividere il dataset in dati di training e dati di test.
	 */
	public Vector<Data> train_test_split()
	{
		
		//scorro tutto il dataset
		for(int i=0;i<train.getData().size()*_test_size;i++) // if data.len = 200 and test_size = 0.4 --> 200 * 0.4 == si ferma al 40% del set 
		{
			int random_index_selection = (int)(Math.random()*train.getData().size());
			
		/*
		 * Ad ogni passo seleziono un esempio, lo cancello da train e lo aggiungo a test. tutto questo finche'
		 * non raggiungo la dimensione dell'array di test.
		 */
		 test.getData().add(train.getData().get(random_index_selection));
		 train.getData().remove(random_index_selection);	
		}
		
		
		//aggiunto train e test all'output
		splitted_values.add(train);
		splitted_values.add(test);
		
		return splitted_values;
	}
	


	
}