package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private int serverPort;
	private String serverIP;
	public Client(int serverPort, String serverIP) {
		this.serverPort = serverPort;
		this.serverIP = serverIP;
	}
	
	public void startClient() throws UnknownHostException, IOException{
		Socket toServer = new Socket(serverIP, serverPort);
		
		userInputListener(toServer);
		
	}

	private void userInputListener(Socket toServer) throws IOException {
		InputStreamReader fromUserReader = new InputStreamReader(System.in);
		
		BufferedReader fromUserReaderBuffer = new BufferedReader(fromUserReader);
		
		String userMessage;
		
		while((userMessage = fromUserReaderBuffer.readLine()) != null){
			sendMessageToServer(toServer, userMessage);
		}
		
	}

	private void sendMessageToServer(Socket toServer, String userMessage) throws IOException {
		OutputStream toServerStream = toServer.getOutputStream();
		
		OutputStreamWriter toServerStreamWriter = new OutputStreamWriter(toServerStream);
		BufferedWriter toServerStreamWriterBuffer = new BufferedWriter(toServerStreamWriter);
		
		toServerStreamWriterBuffer.write(userMessage);
		toServerStreamWriterBuffer.newLine();
		toServerStreamWriterBuffer.flush();
		
	}
	
}
