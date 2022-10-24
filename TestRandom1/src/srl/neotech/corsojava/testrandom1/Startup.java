package srl.neotech.corsojava.testrandom1;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		
		Random rnd =  new Random();
		
		for (int i=0; i<=10; i++) {
			int numeroScelto = rnd.nextInt(10-1) +1;
			System.out.println("E' uscito il numero: "+numeroScelto);
		}

	}

}
