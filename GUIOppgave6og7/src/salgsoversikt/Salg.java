package salgsoversikt;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import kundeoversikt.Kunde;

public class Salg {

	private Kunde solgtTil;
	private ArrayList<SalgsLinje> salgslinjeListe = new ArrayList<SalgsLinje>();
	private GregorianCalendar salgsDato;
	private static int MVA;
	
	public Salg(Kunde solgtTil, ArrayList<SalgsLinje> salgslinjeListe,
			GregorianCalendar salgsDato) {
		super();
		this.solgtTil = solgtTil;
		this.salgslinjeListe = salgslinjeListe;
		this.salgsDato = salgsDato;
	}

	public Kunde getSolgtTil() {
		return solgtTil;
	}

	public void setSolgtTil(Kunde solgtTil) {
		this.solgtTil = solgtTil;
	}

	public ArrayList<SalgsLinje> getSalgslinjeListe() {
		return salgslinjeListe;
	}

	public void setSalgslinjeListe(ArrayList<SalgsLinje> salgslinjeListe) {
		this.salgslinjeListe = salgslinjeListe;
	}

	public GregorianCalendar getSalgsDato() {
		return salgsDato;
	}

	public void setSalgsDato(GregorianCalendar salgsDato) {
		this.salgsDato = salgsDato;
	}

	public static int getMVA() {
		return MVA;
	}

	public static void setMVA(int mVA) {
		MVA = mVA;
	}

	
}
