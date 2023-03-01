package data;

/**
 * Definisce una eccezione controllata
 * @author Luigi Daddario
 *
 */
public class TrainingDataException extends Exception {

	
	/**
	 * Costruttore 
	 */
	public TrainingDataException() {
		super();
	}
	
	/**
	 * Costruttore della classe
	 * @param s
	 */
	public TrainingDataException(String s)
	{
		System.out.println(s);
	}
	

}
