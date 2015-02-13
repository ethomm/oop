package main;

import gui.MainFrame;

import java.awt.EventQueue;

import javax.swing.JLabel;

public class PetsRus {

	public static void main(String[] args) {
		//Kj�rer JFramen
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
}
