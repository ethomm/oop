package main;

import java.awt.EventQueue;

import model.Model;
import view.View;
import controller.Controller;


public class Main {

	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// lager objekt av view
					View frame = new View();
					frame.setVisible(true);
					
					Model model = new Model();
					
					Controller controller = new Controller(frame,model);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
