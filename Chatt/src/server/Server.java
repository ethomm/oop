package server;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	private int port;

	public Server(int port) {
		this.port = port;
	}
	
	public void startServer() throws IOException{
		ServerSocket ss = new ServerSocket(port);
		
		connectionListener(ss);
	}

	private void connectionListener(ServerSocket ss) throws IOException {
		Socket client = ss.accept();
		System.out.println("Connection established to: " + client.getInetAddress() + ":" + client.getPort());
		
		clientMessageListener(client);
		
	}

	private void clientMessageListener(Socket client) throws IOException {
		
		InputStream fromClientStram = client.getInputStream();
		
		InputStreamReader fromClientStreamReader = new InputStreamReader(fromClientStram);
		
		BufferedReader fromClientStreamReaderBuffer = new BufferedReader(fromClientStreamReader);
		
		String messagefromClient;
		
		while((messagefromClient = fromClientStreamReaderBuffer.readLine()) != null){
			System.out.println("Client: " + messagefromClient);
			
			sendEchoToClient(client, messagefromClient);
			
		}
	}

	private void sendEchoToClient(Socket client, String messagefromClient) throws IOException {
		OutputStream toClientStream = client.getOutputStream();
		OutputStreamWriter toClientStreamWriter = new OutputStreamWriter(toClientStream);
		
		BufferedWriter toClientStreamWriterBuffer = new BufferedWriter(toClientStreamWriter);
	
		toClientStreamWriterBuffer.write(messagefromClient);
		toClientStreamWriterBuffer.newLine();
		toClientStreamWriterBuffer.flush();
		
	}
	
}
