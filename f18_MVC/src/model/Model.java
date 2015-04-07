package model;

import java.util.ArrayList;

// klassen som håndterer data i MVC-arkitektur
public class Model {
	// lister som holder på studenter og kurs
	private ArrayList<Student> studenter = new ArrayList<Student>();
	private ArrayList<Kurs> kurs = new ArrayList<Kurs>();
	
	// metoder for å legge til nye studenter og kurs i de respektive listene
	public void leggTilStudent(String id, String fNavn, String eNavn){
		studenter.add(new Student(id, fNavn, eNavn));
	}
	
	public void leggTilKurs(String kurskode, String navn, int stdPoeng){
		kurs.add(new Kurs(kurskode, navn, stdPoeng));
	}
	
	// get-metoder. Vi ønsker ingen set-metoder fordi man ikke skal kunne lage nye lister
	public ArrayList<Student> getStudenter() {
		return studenter;
	}

	public ArrayList<Kurs> getKurs() {
		return kurs;
	}
}