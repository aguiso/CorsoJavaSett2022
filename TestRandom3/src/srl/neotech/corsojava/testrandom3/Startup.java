package srl.neotech.corsojava.testrandom3;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		
		int numeriRandom = new ArrayList(10);
		
		Random rnd =  new Random();
					
				numeriRandom = rnd.nextInt(100-50) +50;
				System.out.println("E' uscito il numero: "+numeriRandom);

	}
}
