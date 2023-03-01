package data;

/**
 * La classe modella un attributo continuo
 * @author Luigi Daddario
 *
 */
public class ContinuousAttribute extends Attribute {
	
	
	private double min;
	private double max;
	
	/**
	 * Inizializza i valori di minimo e massimo
	 */
	public ContinuousAttribute(String name, int index)
	{
		super(name,index);
		min=Double.POSITIVE_INFINITY; //default min
		max=Double.NEGATIVE_INFINITY;
	}
	
	
	/**
	 * Lo scopo è valorizzare l'attributo min. Prende come 
	 * @param v -> un double 
	 * @return void.
	 */
	public void setMin(Double v)
	{
		if(v<min)
			min=v;
	}
	

	/**
	 * Lo scopo è valorizzare l'attributo max. 
	 * @param v -> un double 
	 * @return void.
	 */
	public void setMax(Double v)
	{
		if(v>max)
			max=v;
	}
	
	/**
	 * getter per l'attributo min
	 * @return min
	 */
	public double getMin()
	{
		return min;
	}
	
	/**
	 * getter per l'attributo max
	 */
	public double getMax()
	{
		return max;
		
	}
	

	/**
	 * Lo scopo è scalare il valore tra 0 e 1. Prende come
	 * @param value -> tipo value, è il valore da scalare  
	 * @return void
	 */
	public double scale(Double value)
	{
		return (value-min)/(max-min); 
	}
	
}
