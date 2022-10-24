package srl.neotech.corsojava.randomizzazione;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		
		Random rnd =  new Random();
		
									//(max - min) + min;
		int numeroScelto = rnd.nextInt(10-1) +1;
		System.out.println("E' uscito il numero: "+numeroScelto);
	}

}
