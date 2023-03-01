 package example;



import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;

/**
 * Classe per la modellazione di un oggetto example, che rappresenta il singolo esempio
 * @author Luigi Daddario
 *
 */
public class Example {
	
	private List<Object> example;
	
	/**
	 * Costruttore della classe, inizializza l'attributo example
	 */
	public Example()
	{
		example = new ArrayList<Object>();
	}
	
	/**
	 * Costruttore della classe, l'attributo definisce il numero di feature
	 * @param num
	 */
	public Example(int num)
	{
		example = new ArrayList<Object> (num);
	}
	
	/**
	 * getter dell'attributo example
	 * @return
	 */
	public List<Object> getExample()
	{
		return example;
	}
	
	/**
	 * Lo scopo è ritornare la size dell'attributo example
	 * @return
	 */
	public int getSize()
	{
		return example.size();
	}
	
	/*
	 * 
	 * INPUT: Elemento di tipo Object
	 * OUTPUT: void
	 * SCOPO: Assegnare il valore o all'elemento index di example
	 */
	public void set(Object o)
	{
		example.add(o);
	}
	
	
	/**
	 * Lo scopo è quelllo di assegnare il valore del primo parametro alla feature in posizione (secondo par)
	 * @param o
	 * @param posizione
	 */
	public void set(Object o, int posizione)
	{
		example.add(posizione, o);
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
	
	
	/**
	 * Lo scopo è scambiare i due elementi in posizione "pos" nei due oggetti Example
	 * @param x
	 * @param y
	 * @param pos
	 */
	public void swapSingleItem(Example x, Example y, int pos)
	{
		Object temp;
		temp = x.example.get(pos);
		x.example.set(pos, y.example.get(pos));
		y.example.set(pos, temp);
	}
	

	/**
	 * Scambia i valori contenuti nel campo example dell'oggetto corrente con i valori contenuti nel campo example del parametro
	 * @param e
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
	
	
	/**
	 * Ricerca binaria in un array di Object
	 * @param e
	 * @param x
	 * @return
	 */
    static int binarySearch(Example e, Object x)
    {
        int start = 0, lenght = e.example.size() - 1, check_higher=0;
        while (start <= lenght) {
            int m = start + (lenght - start) / 2;
 
            boolean res = x.equals(e.get(m));
 
            //Check se � al centro
            if (res == true)
                return m;
 
            //se non � uguale
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

    
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

   
    /**
     * Controlla se una stringa in input e' numerica, utilizzando le espressioni regolari
     * @param strNum
     * @return
     */
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    
	
    
    /**
     * Calcola e restituisce la distanza di hamming se le variabili sono categoriche, one_distance nel caso di var continue
     * @param e
     * @return
     */
	public double distance(Example e)
	{
		
		Double hamming = 0.0;
		Double one_distance = 0.0;
		Double parsed_element=0.0;
		int SearchRes;
		
		for(int i=0;i<e.example.size();i++)
		{
			//verifico che sia un double e applico 1-distance RTTI
			if((e.get(i) instanceof Double) || (e.get(i) instanceof Integer))
			{
				
				parsed_element = Double.parseDouble(this.getExample().get(i).toString());
				one_distance = one_distance + (Math.abs((Double) e.get(i) - parsed_element));
			
			}
			else
			{
				//SearchRes = binarySearch(this,e.get(i));
				
				if(!this.get(i).equals(e.get(i)))
					hamming++;

			}
			
		}
		
		return hamming+one_distance;
	
	}
	

	
}
