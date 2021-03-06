package main;

import varelager.VareLager;
import kundeoversikt.Kunde;
import kundeoversikt.KundeOversikt;
import leverandoroversikt.Leverandor;
import leverandoroversikt.LeverandorOversikt;

public class Main {

	public static void main(String[] args) {
		KundeOversikt.leggTilKunde("Janina", "martinsen", "1234", "veverbakken 1", "123", "moss");
		KundeOversikt.leggTilKunde("Eirik", "Thommessen", "9978897", "Engfaret", "1518", "Moss");
		
		LeverandorOversikt.leggTilLeverandor("Pedegree", "Arnt Ove", "artove@peddegree.no", "23423423452", "23432", "23423423", "Butikkveien", "1257", "Oslo");
		System.out.println(LeverandorOversikt.hentLeverandorer());
		
		VareLager.leggTilReptil("Salma", 2300, 4000, (Leverandor) LeverandorOversikt.hentLeverandorer().get(0), "Veldig snill", "WitheBack", "Salamander");
		
		System.out.println(VareLager.hentAlleProdukter());
		System.out.println(KundeOversikt.hentKunde("1234"));
		System.out.println(KundeOversikt.hentKunde("9978897"));
	}

}
