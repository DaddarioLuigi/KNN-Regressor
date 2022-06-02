package data;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {
	
	private List<Object> example;
	
	//costruttore
	public Example()
	{
		example = new ArrayList<Object>();
	}
	
	public List<Object> getExample()
	{
		return example;
	}
	
	public int getSize()
	{
		return example.size();
	}
	
	/*
	 * INPUT: Elemento di tipo Object, index-> indice array
	 * OUTPUT: void
	 * SCOPO: Assegnare il valore o all'elemento index di example
	 */
	public void set(Object o)
	{
		example.add(o);
	}

	/*
	 * INPUT: intero index, indice dell'array
	 * OUTPUT: Elemento di tipo Object
	 * SCOPO: Restituisce il valore memorizzato nella posizione index di example
	 */
	public Object get(int index)
	{
		return example.get(index);
	}
	
	/*
	 * INPUT: due variabili di tipo example e la posizione pos dei campi example di tipo object di x e y
	 * OUTPUT: void
	 * SCOPO: scambiare i due elementi nei due vettori di object (Example->Example(array di tipo object)->[pos]
	 */
	public void swapSingleItem(Example x, Example y, int pos)
	{
		Object temp;
		temp = x.example.get(pos);
		x.example.set(pos, y.example.get(pos));
		y.example.set(pos, temp);
	}
	

	/*
	 * INPUT: e, elemento di tipo example
	 * OUTPUT: void
	 * SCOPO: scambia i valori contenuti nel campo example dell’ oggetto corrente con i valori contenuti nel campo 
	 * example del parametro e 
	 */
	public void swap(Example e)
	{
		
		Object temp; //variabile che utilizzo per effettuare lo swap senza perdita di dati
		if(e.example.size() != this.example.size())
			new ExampleSizeException();
		else
		{
			for(int i=0;i<e.example.size();i++)
			{
				swapSingleItem(e,this,i); //swap del singolo elemento
			}
		}
	}
	
	/*
	 * 
	 * INPUT: 
	 * OUTPUT: 
	 * SCOPO: Ricerca binaria in un array di Object
	 *        
	 */
    static int binarySearch(Example e, Object x)
    {
        int start = 0, lenght = e.example.size() - 1, check_higher=0;
        while (start <= lenght) {
            int m = start + (lenght - start) / 2;
 
            boolean res = x.equals(e.get(m));
 
            //Check se è al centro
            if (res == true)
                return m;
 
            //se non è uguale
            if (res == false)
            {
            	if(check_higher == 0)
            	{
            		start = m + 1;
                	check_higher++;
            	}
            	else if(check_higher > 0)
                	lenght=m-1;
            	
            }       
        }
 
        return -1;
    }

	/*
	 * 
	 * INPUT: e, elemento di tipo example
	 * OUTPUT: double
	 * SCOPO: calcola e restituisce la distanza di Hamming calcolata tra l’istanza di Example passata come 
	 *        parametro e quella corrente
	 */
	public double distance(Example e)
	{
		
		Double hamming = 0.0;
		int SearchRes;

		
		for(int i=0;i<e.example.size();i++)
		{
			SearchRes = binarySearch(this,e.get(i));
			if(SearchRes==-1)
			{
				hamming++;
			}
		}
		
		
		return hamming;
	
	}
}
