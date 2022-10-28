package srl.neotech.corsojava.costruttori;

public class Cupcake {
	
	public String colore;
	public String ripieno;
	
	public Decorazione decorazione;
	
	public Cupcake() {
		
	}
		
	public Cupcake(String ripienoParam) {
			this.ripieno = ripienoParam;
			decorazione = new Decorazione();
		}
	
	public boolean cuoci (int minuti) {
		boolean isCotto = false;
		if (minuti > 10) isCotto = true;
		return isCotto;
	}

}
