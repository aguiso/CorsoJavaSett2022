package srl.neotech.corsojava.scacchimassi;

public class Partita {
	
	private TavoloDaGioco unTavolo;
	
	/* 
	 * Utile solo nel caso ci siano più di due giocatori!!
	 * 
	 * ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
	 */
	
	private Giocatore g1;
	private Giocatore g2;
	
	public Partita() {
		this.unTavolo = new TavoloDaGioco();
		this.g1 = new Giocatore();
		this.g2 = new Giocatore();
	}
	
	public TavoloDaGioco getUnTavolo() {
		return unTavolo;
	}
	public void setUnTavolo(TavoloDaGioco unTavolo) {
		this.unTavolo = unTavolo;
	}
	public Giocatore getG1() {
		return g1;
	}
	public void setG1(Giocatore g1) {
		this.g1 = g1;
	}
	public Giocatore getG2() {
		return g2;
	}
	public void setG2(Giocatore g2) {
		this.g2 = g2;
	}
	
	
	
	
	
	
}
