package srl.neotech.corsojava.java04;

public class Prodotto {
	
	private String codice;
	private String descrizione;
	private Double prezzo;
	

	
	public String getCodice() {
		return codice;
	}



	public void setCodice(String codice) {
		this.codice = codice;
	}



	public String getDescrizione() {
		return descrizione;
	}



	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public Double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}



	public double applicaSconto () {
		double applicaSconto = (prezzo*5)/100;
		prezzo = prezzo - applicaSconto;
		return prezzo;
	}
}
