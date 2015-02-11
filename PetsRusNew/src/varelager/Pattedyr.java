package varelager;

import medlemmer.Leverandor;

public class Pattedyr extends LevendeProdukt{

	private static int antPattedyr;
	
	//Konstruktør
	public Pattedyr(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor,slektsnavn, artsnavn);
		antPattedyr++;
	}
	//Selgmetode
		@Override
		public void selg(String navn){
			super.selg(navn);
			antPattedyr--;	
		}
	
	//Get
	public static int getAntPattedyr() {
		return antPattedyr;
	}
}