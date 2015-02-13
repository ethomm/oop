package varelager;

import java.util.ArrayList;

import medlemmer.Leverandor;

public class Pattedyr extends LevendeProdukt{

	private static int antPattedyr;
	private static ArrayList<Pattedyr> pattedyrliste = new ArrayList<Pattedyr>();
	
	//Konstruktør
	public Pattedyr(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor,slektsnavn, artsnavn);
		antPattedyr++;
		pattedyrliste.add(this);
	}
	//Selgmetode
		@Override
		public void selg(String navn){
			super.selg(navn);
			antPattedyr--;	
			pattedyrliste.remove(this);
		}
		
		@Override
		public String toString(){
			return this.getNavn()+" "+this.getSlektsnavn()+" " +this.getArtsnavn() + " "+this.getUtPris();
		}	
	//Get
	public static int getAntPattedyr() {
		return antPattedyr;
	}
	public static ArrayList<Pattedyr> getPattedyrliste() {
		return pattedyrliste;
	}
}