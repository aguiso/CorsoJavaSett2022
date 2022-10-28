package srl.neotech.corsojava.arraylist02;

import java.util.ArrayList;

public class Startup {
	
	public static ArrayList<Giocattolo> giocattoli = new ArrayList<Giocattolo>();

	public static void main(String[] args) {
		
		for (int i=0; i<800; i++) {
			Giocattolo g = new Giocattolo();
			g.materiale = "Plastica";
			if(i<100) g.colore = "Rosso";
			if(i>101 && i<200) g.colore = "Verde";
			if(i>201 && i<300) g.colore = "Viola";
			if(i>301 && i<400) g.colore = "Giallo";
			if(i>=401) g.colore = "Nero";
			giocattoli.add(g);
			
		}
		
		System.out.println(giocattoli.size());
		
		for (Giocattolo g: giocattoli) {
			System.out.println("colore: "+g.colore+" materiale: "+g.materiale);
		}
	}

}
