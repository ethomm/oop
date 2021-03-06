package medlemmer;

import java.util.ArrayList;

public class Leverandor {
	private String navn;
	private String ePost;
	private String adr;
	private String pSted;
	private String tlf;
	private static ArrayList<Leverandor> leverandorliste = new ArrayList<Leverandor>();
	
	
	//Konstrukør for leverandør
	public Leverandor (String navn, String ePost, String adr, String pSted, String tlf){
		this.navn = navn;
		this.ePost = ePost;
		this.adr = adr;
		this.pSted = pSted;
		this.tlf = tlf;
		leverandorliste.add(this);
	}
	@Override
	public String toString(){
		return this.getNavn();
	}

	//Getteers and setters
	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public static ArrayList<Leverandor> getLeverandorliste() {
		return leverandorliste;
	}

	public String getePost() {
		return ePost;
	}


	public void setePost(String ePost) {
		this.ePost = ePost;
	}


	public String getAdr() {
		return adr;
	}


	public void setAdr(String adr) {
		this.adr = adr;
	}


	public String getpSted() {
		return pSted;
	}


	public void setpSted(String pSted) {
		this.pSted = pSted;
	}


	public String getTlf() {
		return tlf;
	}


	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	
	
}


