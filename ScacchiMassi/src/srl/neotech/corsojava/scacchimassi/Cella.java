package srl.neotech.corsojava.scacchimassi;

public class Cella {
	
	/* 
	 * Integer è un oggetto e quindi ha i metodi della classe Integer
	 */
	
	private Integer posizione;
	private String colore;
	private Pezzo pezzo;
	
	public Pezzo getPezzo() {
		return pezzo;
	}
	public void setPezzo(Pezzo pezzo) {
		this.pezzo = pezzo;
	}
	public Integer getPosizione() {
		return posizione;
	}
	public void setPosizione(Integer posizione) {
		this.posizione = posizione;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	
	 

}
