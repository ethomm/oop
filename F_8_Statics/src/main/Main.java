package main;

public class Main {

	public static void main(String[] args) {
		new Bil("Volvo", "xc-90", 2011);
		new Bil("Toyota", "Corolla", 2002);
		new Bil("Audi", "A3", 2011);
		
		for(Bil b: Bil.getBilliste()){
			System.out.println(b);
		}

	}

}
