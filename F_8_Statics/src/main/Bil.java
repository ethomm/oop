package main;

import java.util.ArrayList;

public class Bil {
	private String merke;
	private String modell;
	private int aarsmodell;
	private static ArrayList<Bil> billiste = new ArrayList<Bil>();
	
	//Konstruktør
	public Bil(String merke, String modell, int aarsmodell) {
		super();
		this.merke = merke;
		this.modell = modell;
		this.aarsmodell = aarsmodell;
		billiste.add(this);
	}
	
	public void selg(){
		billiste.remove(this);
	}
	
	
	//Overskrive toString metoden fra Object klassen
	@Override
	public String toString(){
		return aarsmodell + " " + merke + " " + modell;
	}
	
	//Getters and setters
	public String getMerke() {
		return merke;
	}
	public void setMerke(String merke) {
		this.merke = merke;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public int getAarsmodell() {
		return aarsmodell;
	}
	public void setAarsmodell(int aarsmodell) {
		this.aarsmodell = aarsmodell;
	}
	public static ArrayList<Bil> getBilliste() {
		return billiste;
	}
	
	
	
}
