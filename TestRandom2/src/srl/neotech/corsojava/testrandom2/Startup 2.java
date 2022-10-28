package srl.neotech.corsojava.testrandom2;

import java.util.Random;

public class Startup {
	
	public static void main(String[] args) {
				
				int numeroScelto = 0;
				Random rnd =  new Random();
				
					for (int i=0; i<=10; i++) {
						if (numeroScelto%3==0) {
						numeroScelto = rnd.nextInt(10-1) +1;
						System.out.println("E' uscito il numero: "+numeroScelto);
						}
					}
				

	}

}
