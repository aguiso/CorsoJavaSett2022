package srl.neotech.corsojava.calcoloesame;

import java.util.ArrayList;
import java.util.Random;

public class Startup {
	
	static ArrayList<Integer> voti = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		Integer votoScritto;
		Integer votoOrale;
		
		Random rnd = new Random();
		
		votoScritto = rnd.nextInt(-8,8);
		votoOrale =  rnd.nextInt(0,24);
		
		System.out.println("Voto Scritto: "+votoScritto);
		System.out.println("Voto Orale: "+votoOrale);
		
		/* Calcolo voto finale */
		
		if (votoScritto <= 0) System.out.println("Lo studente è bocciato.");
		if (votoScritto>= 18 && votoOrale >=18 ) System.out.println("Lo Studente è promosso.");
		if (votoScritto >= 0 && votoScritto <= 18 && (votoScritto + votoOrale) > 24) System.out.println("Lo Studente è promosso.");
		if (votoScritto == 30 && votoOrale == 30) System.out.println("Lo studente è promosso con lode.");
	}

}
