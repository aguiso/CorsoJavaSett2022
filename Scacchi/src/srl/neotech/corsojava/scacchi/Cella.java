package srl.neotech.corsojava.scacchi;

public class Cella {
	
	private Integer posizione; // è un oggetto e bisogna crearlo con la new
	private String colore;
	private Pezzo pezzo;
	
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
	public Pezzo getPezzo() {
		return pezzo;
	}
	public void setPezzo(Pezzo pezzo) {
		this.pezzo = pezzo;
	}
	
	
	

}
