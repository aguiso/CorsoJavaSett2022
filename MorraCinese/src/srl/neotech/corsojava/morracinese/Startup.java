package srl.neotech.corsojava.morracinese;

import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		
		System.out.println("Il giocatore sceglie fra: sasso, carta o forbice;");
	    Scanner tastiera = new Scanner(System.in);
	    System.out.print("Scelta del primo giocatore: ");
	    String primoGiocatore = tastiera.next();
	    System.out.print("Scelta del secondo giocatore: ");
	    String secondoGiocatore = tastiera.next();
	    
	    if (primoGiocatore.equals(secondoGiocatore))
	      System.out.println("Pareggio!");
	    else if (primoGiocatore.equals("sasso") && secondoGiocatore.equals("forbice")
	             || primoGiocatore.equals("carta") && secondoGiocatore.equals("sasso")
	             || primoGiocatore.equals("forbice") && secondoGiocatore.equals("carta"))
	      System.out.println("Ha vinto il primo giocatore!");
	    else
	      System.out.println("Ha vinto il secondo giocatore!");
	}

}
