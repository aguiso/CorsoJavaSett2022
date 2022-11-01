package srl.neotech.corsojava.fabbricadibibita;

import java.util.ArrayList;

public class Startup {
	
	static ArrayList<Cisterna> cisterne = new ArrayList<Cisterna>();

	public static void main(String[] args) {
		
		for (int i=0; i<100; i++) {
			Cisterna cist = new Cisterna();
			System.out.print("Numero cisterna: "+i+"; ");
			cisterne.add(cist);
			System.out.println(cist.tipoCisterna());
			cist.setQuantita(null);
			cist.setEvapPerDay(null); 
			cist.setLivelloGas(null);
			/* Le variabili dei vari "set" li ho inizializzati a null perchè non sapevo come impostare i vari valori tra le caratteristiche */
			System.out.println("Cisterna numero: "+cist.tipoCisterna()+" quantita: "+cist.getQuantita()+" Gas evaporato: "+cist.getEvapPerDay()+" livello gas: "+cist.getLivelloGas());
		}
		
		System.out.println(cisterne.size());

	}

}
