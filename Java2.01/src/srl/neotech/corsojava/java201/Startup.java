package srl.neotech.corsojava.java201;

import java.util.ArrayList;

public class Startup {

	public static void main(String[] args) {
		
		ArrayList<Albero> alberi = new ArrayList<Albero>();
		
		
		for (int i=0; i<200; i++) {
			Albero albero = new Albero();
			alberi.add(albero);
			System.out.println("Albero: "+i);
			
			if(i%2!=0) {
				albero.altezza=50;
				System.out.println("Altezza albero disparo: "+albero.altezza);
			}	
			
		}
		
		
		System.out.println("Numero alberi presenti nella lista: "+alberi.size());
		
		
		
	}

}
