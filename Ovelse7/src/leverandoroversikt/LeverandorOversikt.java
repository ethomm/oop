package leverandoroversikt;

import java.util.ArrayList;

import main.SkrivTilFil;

public class LeverandorOversikt {

	private static ArrayList<Leverandor> leverandorListe = new ArrayList<Leverandor>();
	
	//Lager et objekt av classen Leverandor og legger til listen LeverandorListe
	public static void leggTilLeverandor(String navn, String selger, String epost, String kontonr, 
			String kundeNrHosLev, String tlf, String adr, String postnr, String poststed) {
		leverandorListe.add(new Leverandor(navn, selger, epost, kontonr, kundeNrHosLev, tlf, adr, postnr, poststed));
		lagreLeverandorListe();
		
	}
	
	//Henter ut alle objektene i leverandorListe
		public static ArrayList<Leverandor> hentLeverandorer(){
			return leverandorListe;
			}
		
	public static void lagreLeverandorListe(){
		//oppretter en objektListe av Leverandorlisten
		ArrayList<Object> objLeverandorListe = new ArrayList<>();
		for(Leverandor l : leverandorListe){
			objLeverandorListe.add(l);
		}
		
		new SkrivTilFil("leverandor.ser", objLeverandorListe);
	}
		
}
