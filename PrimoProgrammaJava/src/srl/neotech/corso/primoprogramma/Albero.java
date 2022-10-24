package srl.neotech.corso.primoprogramma;

public class Albero {
	
	public int eta;
	public int altezza;
	public int diametro;
	public boolean isFruttifero;
	
	//Metodo per verificare se un albero è da frutto
	
	public boolean alberoDaFrutto() {
		
		if(this.altezza <2 && this.altezza > 10) isFruttifero=false;
		if(this.altezza>=2 && this.altezza<=10) isFruttifero=true;
		
		return isFruttifero;
	}
	

}
