package srl.neotech.corsojava.giocattolo;

import java.util.ArrayList;

public class Startup {
	
	public static ArrayList<Giocattolo> giocattoli = new ArrayList<Giocattolo>();

	public static void main(String[] args) {
		
		for (int i=0; i < 800; i++) {
			Giocattolo g=new Giocattolo();
			g.materiale="Plastica";
			if (i<100) g.colore="Rosso";
			if (i>100 && i<200) g.colore="Verde";
			if (i>200 && i<300) g.colore="Viola";
			if (i>300 && i<400) g.colore="Blu";
			if (i>400) g.colore="Nero";
			
			
			giocattoli.add(g);
		}
		// Per ogni giocatolo; : -> Contenuto in;
		for (Giocattolo g:giocattoli) {
			System.out.println("Colore: "+g.colore+", materiale: "+g.materiale);
		}
	}

}
