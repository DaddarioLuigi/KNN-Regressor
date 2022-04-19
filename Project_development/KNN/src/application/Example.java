package application;

public class Example {
	
	private Object example[];
	private int _size; //ho aggiunto una attributo size, per tracciare la dimensione del vettore 
	
	//costruttore
	public Example(int size)
	{
		example = new Object[size];
		_size = size;
	}
	
	/*
	 * INPUT: Elemento di tipo Object, index-> indice array
	 * OUTPUT: void
	 * SCOPO: Assegnare il valore o all'elemento index di example
	 */
	void set(Object o, int index)
	{
		example[index] = o;
	}

	/*
	 * INPUT: intero index, indice dell'array
	 * OUTPUT: Elemento di tipo Object
	 * SCOPO: Restituisce il valore memorizzato nella posizione index di example
	 */
	Object get(int index)
	{
		return example[index];
	}

	/*
	 * INPUT: e, elemento di tipo example
	 * OUTPUT: void
	 * SCOPO: scambia i valori contenuti nel campo example dell’ oggetto corrente con i valori contenuti nel campo 
	 * example del parametro e 
	 */
	void swap(Object data)
	{
		Object temp = new Object[this._size];
		
		for(int i=0;i<this._size;i++)
		{
			temp = this.example[i];
			this.example[i] = data;
			data = temp;
		}
	}

	/*
	 * INPUT: e, elemento di tipo example
	 * OUTPUT: double
	 * SCOPO: calcola e restituisce la distanza di Hamming calcolata tra l’istanza di Example passata come 
	 *        parametro e quella corrente
	 */
	double distance(Example e)
	{
		return 1.2;
	}
}
