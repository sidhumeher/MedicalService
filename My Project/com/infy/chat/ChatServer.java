package com.infy.chat;

/**
 * @author premraj_p
 *
 */

import java.net.*;
import java.io.*;

import com.infy.chat.ClientInfo;
import com.infy.chat.ClientListener;
import com.infy.chat.ClientSender;
import java.util.Random;

public class ChatServer
{	
	
	
	//public static final int LISTENING_PORT = 1976;
	
	/*public static int genPort(){
		Random randomGenerator=new Random();
		int x=randomGenerator.nextInt(1000000);
		x=x/2000;
		return LISTENING_PORT=x+2000;
	}*/
	
	public static Integer getLISTENING_PORT() {
		return LISTENING_PORT;
	}

	public static Integer LISTENING_PORT;
	
	
	public static void main(String[] args)
	{
		// Open server socket for listening
		ServerSocket serverSocket = null;

		Random randomGenerator=new Random();
		int x=randomGenerator.nextInt(1000000);
		x=x/2000;
		LISTENING_PORT=x+2000;
		
		try {
			serverSocket = new ServerSocket(LISTENING_PORT);
			System.out.println("ChatServer started on port " + LISTENING_PORT);
		} catch (IOException se) {
			System.err.println("Can not start listening on port " + LISTENING_PORT);
			se.printStackTrace();
			System.exit(-1);
		}
 
		// Start ServerDispatcher thread
		ServerDispatcher serverDispatcher = new ServerDispatcher();
		serverDispatcher.start();
 
		// Accept and handle client connections
		while (true) {
			try {
				Socket socket = serverSocket.accept();
				ClientInfo clientInfo = new ClientInfo();
				clientInfo.mSocket = socket;
				ClientListener clientListener =
					new ClientListener(clientInfo, serverDispatcher);
				ClientSender clientSender =
					new ClientSender(clientInfo, serverDispatcher);
				clientInfo.mClientListener = clientListener;
				clientInfo.mClientSender = clientSender;
				clientListener.start();
				clientSender.start();
				serverDispatcher.addClient(clientInfo);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
