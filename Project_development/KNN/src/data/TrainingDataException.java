package data;

public class TrainingDataException extends Exception {

	
	//Costruttore per poter sollevare l'eccezione
	public TrainingDataException() {
		super();
	}
	
	//Secondo costruttore per poter stampare il problema sollevato
	public TrainingDataException(String s)
	{
		System.out.println(s);
	}
	

}
