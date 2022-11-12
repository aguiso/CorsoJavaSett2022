package srl.neotech.corsojava.gestionebiblioteca;

public class Libro extends Biblioteca {
	
	Integer idLibro;
	String titolo;
	String autore;
	String sezione;
	String scaffale;
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	public String getScaffale() {
		return scaffale;
	}
	public void setScaffale(String scaffale) {
		this.scaffale = scaffale;
	}
	
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titolo=" + titolo + ", autore=" + autore + ", sezione=" + sezione
				+ ", scaffale=" + scaffale + "]";
	}
	
	
	
	
}
