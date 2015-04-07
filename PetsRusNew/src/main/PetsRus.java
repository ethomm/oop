package main;

import gui.MainFrame;

import java.awt.EventQueue;

import javax.swing.JLabel;

public class PetsRus {

	public static void main(String[] args) {
		//Kjører JFramen
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame("Pets R Us");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
}
