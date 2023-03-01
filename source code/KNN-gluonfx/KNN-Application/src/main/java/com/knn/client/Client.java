package com.knn.client;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.knn.utility.Keyboard;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Classe che modella un client
 * @author Luigi Daddario
 */
public class Client   {

	private Socket socket=null;
	private ObjectOutputStream out;
	private ObjectInputStream in;
	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	/**
	 * Costruttore di classe
	 * @param address
	 * @param port
	 * @param label
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Client(String address, int port, Label label) throws IOException, ClassNotFoundException
	{

			socket = new Socket(address, port);
			System.out.println(socket);
			//label.setText(socket.toString());
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());	 //stream con richieste del client;
			label.setText("Load a file from your computer/binary file (.dat) \n or load a KNN object from DB");

	}

	/**
	 * Getter
	 * @return out
	 */
	public ObjectOutputStream getOut()
	{
		return out;
	}

	/**
	 * Getter
	 * @return in
	 */
	public ObjectInputStream getIn()
	{
		return in;
	}


	/**
	 * Getter
	 * @return socket
	 */
	public Socket getSocket()
	{return socket;}


}

