package leverandoroversikt;

import java.awt.List;
import java.util.ArrayList;

public class LeverandorOversikt {

	private static ArrayList<Leverandor> leverandorListe = new ArrayList<Leverandor>();
	
	//Lager et objekt av classen Leverandor og legger til listen LeverandorListe
	public static void leggTilLeverandor(String navn, String selger, String epost, String kontonr, 
			String kundeNrHosLev, String tlf, String adr, String postnr, String poststed) {
		leverandorListe.add(new Leverandor(navn, selger, epost, kontonr, kundeNrHosLev, tlf, adr, postnr, poststed));
		
	}
	
	//Henter ut alle objektene i leverandorListe
		public static ArrayList hentLeverandorer(){
			return leverandorListe;
			}
}
