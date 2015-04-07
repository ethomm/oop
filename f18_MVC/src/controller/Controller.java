package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model.Kurs;
import model.Model;
import model.Student;
import view.View;

// klassen som håndterer all data og gui oppdateringer i MVC-arkitektur
public class Controller {
	private View view;
	private Model model;
	
	// konstruktør
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		// legger til nye lyttere på knappene i viewet
		this.view.addActionToKursBtn(new KursActionListener());
		this.view.addActionToStudentBtn(new StudentActionListener());
	}
	
	// indre klasse som definerer logikk for opprettelse av nye Kurs
	private class KursActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// legger til kurs i data (model)
			model.leggTilKurs(view.getKurskode(), view.getKursnavn(), view.getStdPoeng());
			
			// oppdaterer kurslisten i GUI (view)
			updateKurs();
		}
	}
	
	// indre klasse som definerer logikk for opprettelse av nye Studenter
	private class StudentActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// legger til student i data (model)
			model.leggTilStudent(view.getId(), view.getfNavn(), view.geteNavn());
			
			// oppdaterer studentlisten i GUI (view)
			updateStudent();
		}
	}
	
	// metode for å oppdatere kurs i GUI(view)
	private void updateKurs() {
		// lager en ny listemodell til JListen som holder på kurs
		DefaultListModel<Kurs> kursModel = new DefaultListModel<Kurs>();
		
		// går igjennom alle kurs i data (model)
		for(Kurs k: model.getKurs()){
			// Legger til kurset i listemodellen 
			kursModel.addElement(k);
		}
		
		// legger til listemodellen i JList for kurs i GUI (view)
		view.addModelToKursList(kursModel);
		
	}
	
	// metode for å oppdatere studenter i GUI(view)
	public void updateStudent() {
		// lager en ny listemodell til JListen som holder på studenter
		DefaultListModel<Student> studModel = new DefaultListModel<Student>();
		
		// går igjennom alle studenter i data (model)
		for(Student s: model.getStudenter()){
			studModel.addElement(s);
		}
		
		// legger til listemodellen i JList for studenter i GUI (view)
		view.addModelToStudentList(studModel);
	}
}
