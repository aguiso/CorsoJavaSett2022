package srl.neotech.corsojava.fabbricadibibitadefinitivo;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		
		Cantina cantina = new Cantina();
		
		Random rnd = new Random();
		
		for (int i=0; i<100; i++ ) {
			Cisterna unaCisternaDaAggiungere = new Cisterna();
			unaCisternaDaAggiungere.setTheshold(45);
			
			//imposto il materiale
			int numeroCasuale = rnd.nextInt(4-1) +1;
			if (numeroCasuale==1) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.ACCIAIO.toString());
			if (numeroCasuale==2) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.ALLUMINIO.toString());
			if (numeroCasuale==3) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.RAME.toString());
			cantina.getCisterne().add(unaCisternaDaAggiungere);
			
			numeroCasuale = rnd.nextInt(1,1001);
			unaCisternaDaAggiungere.setQuantita(numeroCasuale);
			
			numeroCasuale = rnd.nextInt(1,11);
			unaCisternaDaAggiungere.setEvapPerDay(numeroCasuale);
			
			numeroCasuale = rnd.nextInt(1,101);
			unaCisternaDaAggiungere.setLivelloGas(numeroCasuale);
			
			if (unaCisternaDaAggiungere.getLivelloGas() < unaCisternaDaAggiungere.getTheshold() ) {
				System.out.println("La bevanda è vendibile");
			}
			else 
				System.out.println("La bevanda non è vendibile");
						
		}
		
		for (Cisterna c: cantina.getCisterne()) {
			System.out.println(c);
		}

	}

}
