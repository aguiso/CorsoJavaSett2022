package srl.neotech.corso.primoprogramma;

public class Startup {

	public static void main(String[] args) {
		
		Albero diMassimiliano = new Albero();
		Albero diAlessandro = new Albero();
		
		diMassimiliano.altezza =5;
		diAlessandro.altezza =11;
		
		boolean daFrutto1 = diMassimiliano.alberoDaFrutto();
		boolean daFrutto2 = diAlessandro.alberoDaFrutto();
		
		if (daFrutto1==false) {
			System.out.println("L'albero di Massimiliano è alto "+diMassimiliano.altezza+" metri e non è un albero da frutto;");
		}
		else {
			System.out.println("L'albero di Massimiliano è alto "+diMassimiliano.altezza+" metri ed è un albero da frutto;");
		}
		
		if (daFrutto2==false) {
			System.out.println("L'albero di Alessandro è alto "+diAlessandro.altezza+" metri e non è un albero da frutto;");
		}
		else {
			System.out.println("L'albero di Alessandro è alto "+diAlessandro.altezza+" metri ed è un albero da frutto;");
		}
		
		
	}

}
