package varelager;

import java.io.Serializable;

import leverandoroversikt.Leverandor;

public class AnnetProdukt extends Produkt implements Serializable{

	private static final long serialVersionUID = 279067705536979721L;
	
	private int antAvTypeAnnetProdukt;
	
	public AnnetProdukt(String navn, double innPris, double utPris,
			Leverandor leverandor, String produktBeksrivelse,
			int antAvTypeAnnetProdukt) {
		super(navn, innPris, utPris, leverandor, produktBeksrivelse);
		this.antAvTypeAnnetProdukt = antAvTypeAnnetProdukt;
	}

	public int getAntAvTypeAnnetProdukt() {
		return antAvTypeAnnetProdukt;
	}

	public void setAntAvTypeAnnetProdukt(int antAvTypeAnnetProdukt) {
		this.antAvTypeAnnetProdukt = antAvTypeAnnetProdukt;
	}

	@Override
	
	public String toString(){
		return super.getNavn()+ "- Forbruksartikkel - " + this.getAntAvTypeAnnetProdukt() + " stk.";
	}

	
	
}
