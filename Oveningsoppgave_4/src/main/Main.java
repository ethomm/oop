package main;

import gui.MainFrame;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				//Starter GUI
				new MainFrame("�vningsoppgave 4");
				
			}
		});

	}

}