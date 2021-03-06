package varelager;

import leverandoroversikt.Leverandor;

public class Produkt {

	private String navn;
	private double innPris;
	private double utPris;
	private Leverandor leverandor;
	private String produktBeskrivelse;
	private static int antProd;
	
	public Produkt(String navn, double innPris, double utPris,
			Leverandor leverandor, String produktBeksrivelse) {
		super();
		this.navn = navn;
		this.innPris = innPris;
		this.utPris = utPris;
		this.leverandor = leverandor;
		this.produktBeskrivelse = produktBeksrivelse;
	}

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

	public String getProduktBeksrivelse() {
		return produktBeskrivelse;
	}

	public void setProduktBeksrivelse(String produktBeksrivelse) {
		this.produktBeskrivelse = produktBeksrivelse;
	}

	public static int getAntProd() {
		return antProd;
	}

	public static void setAntProd(int antProd) {
		Produkt.antProd = antProd;
	}
	
	
}
