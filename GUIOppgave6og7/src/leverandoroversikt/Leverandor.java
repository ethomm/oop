package leverandoroversikt;

public class Leverandor {
	
	private String navn;
	private String selger;
	private String epost;
	private String kontoNr;
	private String kundeNrHosLev;
	private String tlf;
	private String adr;
	private String postNr;
	private String postSted;
	
	public Leverandor(String navn, String selger, String epost, String kontoNr,
			String kundeNrHosLev, String tlf, String adr, String postNr,
			String postSted) {
		super();
		this.navn = navn;
		this.selger = selger;
		this.epost = epost;
		this.kontoNr = kontoNr;
		this.kundeNrHosLev = kundeNrHosLev;
		this.tlf = tlf;
		this.adr = adr;
		this.postNr = postNr;
		this.postSted = postSted;
	}
	
	@Override
	public String toString(){
		return navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getSelger() {
		return selger;
	}

	public void setSelger(String selger) {
		this.selger = selger;
	}

	public String getEpost() {
		return epost;
	}

	public void setEpost(String epost) {
		this.epost = epost;
	}

	public String getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}

	public String getKundeNrHosLev() {
		return kundeNrHosLev;
	}

	public void setKundeNrHosLev(String kundeNrHosLev) {
		this.kundeNrHosLev = kundeNrHosLev;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getPostNr() {
		return postNr;
	}

	public void setPostNr(String postNr) {
		this.postNr = postNr;
	}

	public String getPostSted() {
		return postSted;
	}

	public void setPostSted(String postSted) {
		this.postSted = postSted;
	}
	
	
}
