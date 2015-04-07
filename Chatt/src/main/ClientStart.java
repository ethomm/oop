package main;

import java.io.IOException;
import java.net.UnknownHostException;

import client.Client;

public class ClientStart {

	public static void main(String[] args) {
		Client c = new Client(3456, "localhost");
		
		try {
			c.startClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
