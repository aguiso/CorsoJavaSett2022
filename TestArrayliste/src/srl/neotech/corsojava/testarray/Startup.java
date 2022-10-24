 package srl.neotech.corsojava.testarray;

import java.util.ArrayList;

public class Startup {
		
		//  Array è una lista FISSA!!!
		static int[] arrayDiInteri = {23,56,87,1,467,90};
		static String[] giorniDellaSettimana = {"lunedì", "martedì", "mercoledì","giovedì"};
		
		public static void main(String[] args) {
			
			// L'Array List è un Array Dinamico
			ArrayList<String> giorniDellaSettimanaDinamici = new ArrayList<String>();
			
					
			
			for (int j=0; j<1000; j++) {
				giorniDellaSettimanaDinamici.add("Giorno: "+j);
			}
			
			giorniDellaSettimanaDinamici.remove(170);
			
			giorniDellaSettimanaDinamici.add(400, "Giorno: KKK");
			
			for (int k=0; k<giorniDellaSettimanaDinamici.size(); k++) {
				System.out.println(giorniDellaSettimanaDinamici.get(k));
			}
			
			ArrayList<Aereo> aereiInPartenza = new ArrayList<Aereo>();
			
			for (int i=0; i<100; i++) {
				Aereo boingInPartenza = new Aereo();
				boingInPartenza.compagniaAerea = i + "  Lufthansa";
				boingInPartenza.numeroPosti = 46;
				aereiInPartenza.add(boingInPartenza);
			}
			
			for (int w=0; w<aereiInPartenza.size(); w++) {
				System.out.println(aereiInPartenza.get(w).numeroPosti);
			}
			
			// for each----
			// per ogni classe Aereo..che chiamo iesimoaereo presente nella lista areiInPartenza
			for (Aereo iesimoAereo: aereiInPartenza) {
				System.out.println(iesimoAereo.compagniaAerea);
			}
			
			System.out.println("Ci sono in partenza: "+aereiInPartenza.size()+" boing");
	}

}
