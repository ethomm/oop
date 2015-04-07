package varelager;

import java.io.Serializable;

import leverandoroversikt.Leverandor;

public class Reptil extends LevendeProdukt implements Serializable {

	private static final long serialVersionUID = 4294601217217825848L;

	public Reptil(String navn, double innPris, double utPris,
			Leverandor leverandor, String produktBeskrivelse,
			String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor, produktBeskrivelse, slektsnavn,
				artsnavn);
	}

	
}
