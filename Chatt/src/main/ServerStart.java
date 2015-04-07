package main;

import java.io.IOException;

import server.Server;

public class ServerStart {

	public static void main(String[] args) {
		Server server = new Server(3456);
		try {
			server.startServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
