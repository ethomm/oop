package varelager;

import java.util.ArrayList;

import medlemmer.Leverandor;

public class Reptil extends LevendeProdukt{
	private static int antReptiler;
	private static ArrayList<Reptil> reptilliste = new ArrayList<Reptil>();

	//Kontruktør
	public Reptil(String navn, double innPris, double utPris,
			Leverandor leverandor, String slektsnavn,
			String artsnavn) {
		super(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
		antReptiler++;
		reptilliste.add(this);
	}
	
	//Selgmetode
		@Override
		public void selg(String navn){
			super.selg(navn);
			antReptiler--;
			reptilliste.remove(this);
		}
		@Override
		public String toString(){
			return this.getNavn()+" "+this.getSlektsnavn()+" " +this.getArtsnavn() + " "+this.getUtPris();
		}	
	//Get
	public static int getAntReptiler() {
		return antReptiler;
	}

	public static ArrayList<Reptil> getReptilliste() {
		return reptilliste;
	}

	
}