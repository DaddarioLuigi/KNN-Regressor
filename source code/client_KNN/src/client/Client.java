package client;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import utility.Keyboard;

public class Client {
	
	private Socket socket=null;
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	
	Client (String address, int port) throws IOException, ClassNotFoundException
	{
			
			socket = new Socket(address, port);
			System.out.println(socket);	
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());	 //stream con richieste del client;
			talking();
			
	}
	
	/**
	 * Comunicazione con il server
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("removal")
	private void talking() throws IOException, ClassNotFoundException {
		
		int decision=0;
		String menu="";
		String c;
		
		do {	
			do{
			
				System.out.println("Load KNN from file [1]");
				System.out.println("Load KNN from binary file  [2]");
				System.out.println("Load KNN from database  [3]");
				decision=Keyboard.readInt();
			}while(decision <= 0 || decision >3);
			
			
			String risposta="";
			do {
				out.writeObject(decision);
				String tableName="";
				if(decision == 1)
					System.out.println("Inserisci nome file con estensione (.dat/.txt): ");
				else if(decision == 2)
					System.out.println("Inserisci nome file binario (con estensione .dat): ");
				else	
					System.out.println("Nome tabella (senza estensione):");
				tableName=Keyboard.readString();
				out.writeObject(tableName);
				risposta=in.readObject().toString();
			
			}
			while(risposta.contains("@ERROR"));
			
			
			System.out.println("KNN loaded on the server");
			// predict
			
			do {
				//out.writeObject(4);
				boolean flag=true; //reading example
				do {
					
					risposta=in.readObject().toString();
					//System.out.println(risposta);
		
					if(!risposta.contains("Inserisci valore k>=1:")) {
						
							//if(attribute.class --> discrete) ??
							if(risposta.equals("@READSTRING"))  //leggo una stringa
							{
								System.out.println("\nInserisci valore discreto: ");
								out.writeObject(Keyboard.readString());
							}
							else if (risposta.equals("@READOUBLE"))
							{
								double x=0.0;
								do {
			
									System.out.println("\nInserisci valore continuo");								
									x=Keyboard.readDouble();
								}
								while(new Double(x).equals(Double.NaN));
								out.writeObject(x);
								
							}
						}
						else flag=false;	
					
				}while(flag);
				
				
				//sto leggendo  k
				//risposta=in.readObject().toString(); //leggi il messaggio
				int k=0;
				do {
					System.out.print("Inserisci valore k>=1");
					k=Keyboard.readInt();
				}while (k<1);
				out.writeObject(k);
				//aspetto la predizione 
				
				System.out.println("Prediction:"+in.readObject());
				System.out.println("Vuoi ripetere predizione? Y/N");
				c=Keyboard.readString();
		
				out.writeObject(c);
				
			}while (c.toLowerCase().equals("y"));	
			
			
			System.out.println("Vuoi ripetere una nuova esecuzione con un nuovo oggetto KNN? (Y/N)");
			menu=Keyboard.readString();
		}
		while(menu.toLowerCase().equals("y"));
		
		if(menu.toLowerCase().equals("n"))
		{
			System.out.println("Arrivederci!");
			return;
		}
		
		
	}
	public static void main(String[] args){
		
		InetAddress addr;
		try {
			addr = InetAddress.getByName("127.0.0.1");
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
			return;
		}
		
		Client c;
		try {
			c=new Client("127.0.0.1", 2025);
			
		}  catch (IOException e) {
			System.out.println(e.toString());
			return;
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
			return;
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
			return;
		}
	}

		


}
