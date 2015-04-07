package model;

// representerer en student i systemet
public class Student {
	private String studId;
	private String fNavn;
	private String eNavn;
	
	// konstruktør
	public Student(String studId, String fNavn, String eNavn) {
		this.studId = studId;
		this.fNavn = fNavn;
		this.eNavn = eNavn;
	}
	
	// overskrevet toString metode
	@Override
	public String toString() {
		return studId + ": " + eNavn + ", " + fNavn;
	}

	// get og set
	public String getStudId() {
		return studId;
	}


	public void setStudId(String studId) {
		this.studId = studId;
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
	
}
