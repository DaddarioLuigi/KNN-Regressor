package server;

import java.io.*;
import java.net.*;

/**
 * Modella il server che attenderà le richieste del client
 * @author Luigi Daddario
 *
 */
public class Server {
	
	private static int PORT = 2025;
	
	public Server(int port) throws IOException
	{
		ServerSocket s = new ServerSocket(PORT);
		run(s);
	}
	
	private void run(ServerSocket s) throws IOException
	{
		Socket client_sock;
		try {
			while(true) {
				client_sock = s.accept();
				try {
					new ServerOneClient(client_sock);
				} catch (IOException e)
				{
					//if fails -> socket close
					//else thread will close it
					client_sock.close();
				}
			}
		} finally {
			s.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Waiting for a client to connect...");
		Server s = new Server(PORT);
		
	}

}

	



