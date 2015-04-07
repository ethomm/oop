package varelager;

import java.io.Serializable;

import leverandoroversikt.Leverandor;

public class Pattedyr extends LevendeProdukt implements Serializable {


	private static final long serialVersionUID = 1404081937490256416L;

	public Pattedyr(String navn, double innPris, double utPris,
			Leverandor leverandor, String produktBeskrivelse,
			String slektsnavn, String artsnavn) {
		super(navn, innPris, utPris, leverandor, produktBeskrivelse, slektsnavn,
				artsnavn);
	}
	
}
