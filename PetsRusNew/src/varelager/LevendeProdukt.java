package varelager;

import medlemmer.Leverandor;

public class LevendeProdukt extends Produkt {
	
	private String slektsnavn;
	private String artsnavn;
	private static int antLevProd;
	
	
	//Kontruktør 
	public LevendeProdukt(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor);
		this.slektsnavn = slektsnavn;
		this.artsnavn = artsnavn;
		antLevProd++;
	}
	
	//Selgmetode
		@Override
		public void selg(String navn){
			super.selg(navn);
			antLevProd--;	
		}
	
	//Getters and setters
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
	public static int getAntLevProd() {
		return antLevProd;
	}
	
	
}
