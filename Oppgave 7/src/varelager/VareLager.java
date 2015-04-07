package varelager;

import java.util.ArrayList;

import leverandoroversikt.Leverandor;
import main.SkrivTilFil;

public class VareLager {

	public static ArrayList<Produkt> produktListe = new ArrayList<Produkt>();

	//Legger til Reptiler i listen
	public static void leggTilReptil(String navn, double innPris, double utPris, 
			Leverandor leverandor, String produktBeskrivelse, String slektsnavn, String artsnavn){
		produktListe.add(new Reptil(navn, innPris, utPris, leverandor, produktBeskrivelse, slektsnavn, artsnavn));
		
		//Etter et produkt er lagt til listen lagres listen i varelager.ser 
		LagrerVarer();
	}
	
	//Legger til Pattedyr i listen 
	public static void leggTilPattedyr(String navn, double innPris, double utPris, 
			Leverandor leverandor, String produktBeskrivelse, String slektsnavn, String artsnavn){
		produktListe.add(new Pattedyr(navn, innPris, utPris, leverandor, produktBeskrivelse, slektsnavn, artsnavn));
		 
		//Etter et produkt er lagt til listen lagres listen i varelager.ser
		LagrerVarer();
	}
	
	//Legger til Fisker i listen
	public static void leggTilFisk(String navn, double innPris, double utPris, 
			Leverandor leverandor, String produktBeskrivelse, int antallAvType, String slektsnavn, String artsnavn){
		produktListe.add(new Fisk(navn, innPris, utPris, leverandor, produktBeskrivelse, slektsnavn, artsnavn, antallAvType));
		
		//Etter et produkt er lagt til listen lagres listen i varelager.ser
		LagrerVarer();
	}
	//legger til AnnetProdukt i listen
	public static void leggTilAnnetProdukt(String navn, double innPris, double utPris, 
			Leverandor leverandor, String produktBeskrivelse, int antallAvType){
		produktListe.add(new AnnetProdukt(navn, innPris, utPris, leverandor, produktBeskrivelse, antallAvType));
		
		//Etter et produkt er lagt til listen lagres listen i varelager.ser
		LagrerVarer();
	}

	//Get funksjon for produktListen
	public static ArrayList<Produkt> hentAlleProdukter(){
		return produktListe;
		
	}
	//Metode som regner antall varer
	
	//Antall pattedyr
	public static int getAntallPattedyr(){
		int pattedyr = 0;
		for (Produkt prod : produktListe) {
			if(prod instanceof Pattedyr){
				pattedyr++;
			}	
		}
		return pattedyr;
	}
	
	//Antall reptiler
	public static int getAntallReptiler(){
		int reptiler = 0;
		for (Produkt prod : produktListe) {
			if(prod instanceof Reptil){
				reptiler++;
			}	
		}
		return reptiler;
	}
	//Antall Fisker
	public static int getAntallFisk(){
		int fisk = 0;
		for (Produkt prod : produktListe) {
			if(prod instanceof Fisk){
				fisk += ((Fisk) prod).getAntAvTypeAnnetProdukt();
						}	
		}
		return fisk;
	}
	//Antall av Andre produkter
	public static int getAntallAndreProdukter(){
		int fisk = 0;
		for (Produkt prod : produktListe) {
			if(prod instanceof AnnetProdukt){
				fisk += ((AnnetProdukt) prod).getAntAvTypeAnnetProdukt();
						}	
		}
		return fisk;
	}
	
	
	//Lagre funksjon som skriver til serialiserte filer
	public static void LagrerVarer(){
		//oppretter en objektListe av ProduktListen
		ArrayList<Object> objProduktListe = new ArrayList<>();
		for(Produkt p : produktListe){
			objProduktListe.add(p);
		}
		
		new SkrivTilFil("varelager.ser", objProduktListe);
	}

}
