package varelager;

import medlemmer.Leverandor;

public class Produkt {
	private String navn;
	private double innPris;
	private double utPris;
	private Leverandor leverandor;
	private static int antProd;
	
	//Konstrukør for Produkt
	public Produkt(String navn, double innPris, double utPris,
			Leverandor leverandor) {
		super();
		this.navn = navn;
		this.innPris = innPris;
		this.utPris = utPris;
		this.leverandor = leverandor;
		antProd++;
	}
	
	//Salgsmetode
	public void selg(String navn){
		antProd--;
	}
	
	//Getters and Setters
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getInnPris() {
		return innPris;
	}

	public void setInnPris(double innPris) {
		this.innPris = innPris;
	}

	public double getUtPris() {
		return utPris;
	}

	public void setUtPris(double utPris) {
		this.utPris = utPris;
	}

	public Leverandor getLeverandor() {
		return leverandor;
	}

	public void setLeverandor(Leverandor leverandor) {
		this.leverandor = leverandor;
	}

	public static int getAntProd() {
		return antProd;
	}
	
	
}