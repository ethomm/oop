package varelager;

import medlemmer.Leverandor;

public class Artikel extends Produkt{
	
	private static int antArt;
	//Konstruktør
	public Artikel(String navn, double innPris, double utPris,
			Leverandor leverandor) {
		super(navn, innPris, utPris, leverandor);	
		antArt++;
	}
	
	//Selgmetode
	@Override
	public void selg(String navn){
		super.selg(navn);
		antArt--;	
	}
	
	//Get
	
	public static int getAntArt() {
		return antArt;
	}
	
}
