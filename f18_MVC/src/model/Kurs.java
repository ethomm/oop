package model;

// representerer et kurs i systemet
public class Kurs {
	private String kurskode;
	private String navn;
	private int stdPoeng;
	
	// konstruktør
	public Kurs(String kurskode, String navn, int stdPoeng) {
		this.kurskode = kurskode;
		this.navn = navn;
		this.stdPoeng = stdPoeng;
	}
	
	// overskriver toString
	@Override
	public String toString() {
		return kurskode + ": " + navn + " - " + stdPoeng;
	}
	
	// get og set
	public String getKurskode() {
		return kurskode;
	}
	public void setKurskode(String kurskode) {
		this.kurskode = kurskode;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public int getStdPoeng() {
		return stdPoeng;
	}
	public void setStdPoeng(int stdPoeng) {
		this.stdPoeng = stdPoeng;
	}
	
}
