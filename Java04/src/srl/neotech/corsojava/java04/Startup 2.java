package srl.neotech.corsojava.java04;

import java.util.ArrayList;

public class Startup {
	
	public static ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();

	public static void main(String[] args) {
		
		for (int i=0; i<200; i++) {
			
			Alimentare alim = new Alimentare();
			alim.setCodice("654321");
			alim.setDescrizione("plastica");
			alim.setPrezzo(25.00);
			alim.applicaSconto();
			alim.calcoloScadenza();
			prodotti.add(alim);
			System.out.println("Prodotto: "+prodotti.size()+" codice: "+alim.getCodice()+" descrizione: "+alim.getDescrizione()+" prezzo: "+alim.getPrezzo()+" prezzo scontato: "+alim.applicaSconto()+" data di scadenza: "+alim.calcoloScadenza());
			
			NonAlimentare nonAlim = new NonAlimentare();
			nonAlim.setCodice("123456");
			nonAlim.setDescrizione("ferro");
			nonAlim.setPrezzo(12.50);
			nonAlim.applicaSconto();
			nonAlim.calcoloMateriale();
			prodotti.add(nonAlim);
			System.out.println("Prodotto: "+prodotti.size()+" codice: "+nonAlim.getCodice()+" descrizione: "+nonAlim.getDescrizione()+" prezzo: "+nonAlim.getPrezzo()+" prezzo scontato: "+nonAlim.applicaSconto()+" tipo materiale: "+nonAlim.calcoloMateriale());
		}
		
		System.out.println(prodotti.size());

	}

}
