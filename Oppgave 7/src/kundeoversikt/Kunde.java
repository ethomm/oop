package kundeoversikt;

import java.io.Serializable;

public class Kunde implements Serializable{

	private static final long serialVersionUID = 714429944062198899L;
	
	private String fNavn;
	private String eNavn;
	private String tlf;
	private String adr;
	private String postNr;
	private String postSted;
	
	public Kunde(String fNavn, String eNavn, String tlf, String adr,
			String postNr, String postSted) {
		super();
		this.fNavn = fNavn;
		this.eNavn = eNavn;
		this.tlf = tlf;
		this.adr = adr;
		this.postNr = postNr;
		this.postSted = postSted;
	}

	@Override
	public String toString(){
		return fNavn+" "+eNavn;
	}
	public String getfNavn() {
		return fNavn;
	}

	public void setfNavn(String fNavn) {
		this.fNavn = fNavn;
	}

	public String geteNavn() {
		return eNavn;
	}

	public void seteNavn(String eNavn) {
		this.eNavn = eNavn;
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
