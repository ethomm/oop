package varelager;

import medlemmer.Leverandor;

public class Reptil extends LevendeProdukt{
	private static int antReptiler;

	//Kontruktør
	public Reptil(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		antReptiler++;
	}
	
	//Selgmetode
		@Override
		public void selg(String navn){
			super.selg(navn);
			antReptiler--;	
		}
	
	//Get
	public static int getAntReptiler() {
		return antReptiler;
	}

	
}