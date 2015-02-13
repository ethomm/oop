package varelager;

import java.util.Calendar;
import java.util.GregorianCalendar;

import medlemmer.Leverandor;

public class Matartikel extends Artikel {
	private static int antMatArt;
	private GregorianCalendar bestfor;	
	
	/**private GregorianCalendar bestfor(int dag, int maaned, int aar){
		return 
	}*/
	
	//Konstruktør
	public Matartikel(String navn, double innPris, double utPris,
			Leverandor leverandor, GregorianCalendar bestfor) {
		super(navn, innPris, utPris, leverandor);
		this.bestfor = bestfor;
		antMatArt++;
	}
	
	//Selgmetode
		@Override
		public void selg(String navn){
			super.selg(navn);
			antMatArt--;	
		}
	
	// Get sett
	public static int getAntMatArt() {
		return antMatArt;
	}
	
	public GregorianCalendar getBestfor() {	
		return this.bestfor;
	}
	public void setBestfor(GregorianCalendar bestfor) {
		this.bestfor = bestfor;
	}

}