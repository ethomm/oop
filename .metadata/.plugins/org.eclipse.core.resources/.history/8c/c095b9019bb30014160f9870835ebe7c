package varelager;

import medlemmer.Leverandor;

public class Fisk extends LevendeProdukt{
	private static int antFisk;

	//Konstruktør
	public Fisk(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		antFisk++;
	}
	//Selgmetode
		@Override
		public void selg(String navn){
		super.selg(navn);
		 antFisk--;
		}
	
		//GET
	public static int getAntFisk() {
		return antFisk;
	}
}
