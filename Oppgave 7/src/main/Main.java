package main;

import gui.Gui;

import java.awt.EventQueue;

import salgsoversikt.SalgsOversikt;
import varelager.VareLager;
import kundeoversikt.Kunde;
import kundeoversikt.KundeOversikt;
import leverandoroversikt.Leverandor;
import leverandoroversikt.LeverandorOversikt;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//Leser inn all lagret data
<<<<<<< Updated upstream
				new LesFraFil(System.getProperty("user.dir")+"/kunde.ser");
				new LesFraFil(System.getProperty("user.dir")+"/varelager.ser");
				new LesFraFil(System.getProperty("user.dir")+"/leverandor.ser");
=======
				new LesFraFil("/Users/EirikThommessen/Documents/Studier/V2015/oop/Oppgave 7/kunde.ser");
				new LesFraFil("/Users/EirikThommessen/Documents/Studier/V2015/oop/Oppgave 7/varelager.ser");
				new LesFraFil("/Users/thomasengebretsen/Documents/Spillprogrammering/oop/Oppgave 7/leverandor.ser");
>>>>>>> Stashed changes
				//new LesFraFil("salg.ser");
				
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
					KundeOversikt kunde = new KundeOversikt();
					LeverandorOversikt leverandor = new LeverandorOversikt();
					SalgsOversikt salgsoversikt = new SalgsOversikt();
					VareLager varelager = new VareLager();
					
					Controller controller= new Controller(frame, kunde, leverandor, salgsoversikt, varelager);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

}
