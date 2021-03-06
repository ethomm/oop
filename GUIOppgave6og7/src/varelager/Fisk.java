package varelager;

import leverandoroversikt.Leverandor;

public class Fisk extends LevendeProdukt {

	private int antAvTypeAnnetProdukt;
	

	public Fisk(String navn, double innPris, double utPris,
			Leverandor leverandor, String produktBeskrivelse,
			String slektsnavn, String artsnavn, int antAvTypeAnnetProdukt) {
		super(navn, innPris, utPris, leverandor, produktBeskrivelse,
				slektsnavn, artsnavn);
		this.antAvTypeAnnetProdukt = antAvTypeAnnetProdukt;
	}


	public int getAntAvTypeAnnetProdukt() {
		return antAvTypeAnnetProdukt;
	}


	public void setAntAvTypeAnnetProdukt(int antAvTypeAnnetProdukt) {
		this.antAvTypeAnnetProdukt = antAvTypeAnnetProdukt;
	}


}
