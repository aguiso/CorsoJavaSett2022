package srl.neotech.corso.allocazione;

public class Startup {

	public static void main(String[] args) {
		
		int a=5;
		double b=5.67;
		
		System.out.println(a+b);
		
		Animale gattoDiSilvia=new Animale();
		gattoDiSilvia.eta=67;  
		gattoDiSilvia.calcoloEtaTotale();
		gattoDiSilvia.numeroZampe=4;
		System.out.println("Il gatto di silvia ha: "+gattoDiSilvia.eta+"  anni.");
		
		String tipoAnimaleDiSilvia=gattoDiSilvia.calcoloTipoAnimale();
		
		System.out.println("Il gatto di silvia è un: "+tipoAnimaleDiSilvia);
	}

}
