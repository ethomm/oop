package varelager;

import java.util.ArrayList;
import medlemmer.Leverandor;

public class Fisk extends LevendeProdukt{
	private static int antFisk;
	private static ArrayList<Fisk> fiskeliste = new ArrayList<Fisk>();

	//Konstruktør
	public Fisk(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		antFisk++;
		fiskeliste.add(this);
	}
	//Selgmetode
		@Override
		public void selg(String navn){
		super.selg(navn);
		 antFisk--;
		 fiskeliste.remove(this);
		}
	
		@Override
		public String toString(){
			return this.getNavn()+" "+this.getSlektsnavn()+" " +this.getArtsnavn() + " "+this.getUtPris();
		}	
	//GET
	public static int getAntFisk() {
		return antFisk;
	}
	
	public static ArrayList<Fisk> getFiskeliste() {
		return fiskeliste;
	}
}
