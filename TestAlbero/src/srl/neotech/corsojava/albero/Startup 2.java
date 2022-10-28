package srl.neotech.corsojava.albero;

import java.util.ArrayList;

public class Startup {
	//                      tipo    nome lista(sempre al plurale)
	public static ArrayList<Albero> alberi =new ArrayList<Albero>();

	public static void main(String[] args) {
		
		
		for (int i=0; i<200; i++) {
			Albero albero = new Albero();
			//dispari: variabile%2!=0; pari: variabile%2==0;
			if (i%2!=0) albero.altezza=50;
			if (i==170) albero.altezza=400;
			alberi.add(albero);
			System.out.println("Albero: "+i);
		}
		
		alberi.get(170).altezza=400;
	}
	

}
