package varelager;

import java.io.Serializable;

import leverandoroversikt.Leverandor;

public class LevendeProdukt extends Produkt implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6207772060005772915L;
	private String slektsnavn;
	private String artsnavn;
	
	public LevendeProdukt(String navn, double innPris, double utPris,
			Leverandor leverandor, String produktBeskrivelse,
			String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor, produktBeskrivelse);
		this.slektsnavn = slektsnavn;
		this.artsnavn = artsnavn;
	}
	
	@Override
	public String toString(){
		return super.getNavn() + " -  " + this.getArtsnavn();
	}
	
	public String getSlektsnavn() {
		return slektsnavn;
	}

	public void setSlektsnavn(String slektsnavn) {
		this.slektsnavn = slektsnavn;
	}

	public String getArtsnavn() {
		return artsnavn;
	}

	public void setArtsnavn(String artsnavn) {
		this.artsnavn = artsnavn;
	}
	
	
}
