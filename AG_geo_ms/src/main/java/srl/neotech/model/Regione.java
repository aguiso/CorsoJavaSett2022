package srl.neotech.model;

public class Regione {
	
	private Integer idRegione;
	private String Regione;
	
	public Integer getIdRegione() {
		return idRegione;
	}
	public void setIdRegione(Integer idRegione) {
		this.idRegione = idRegione;
	}
	public String getRegione() {
		return Regione;
	}
	public void setRegione(String regione) {
		Regione = regione;
	}
	
	public Regione(Integer idRegione, String regione) {
		this.idRegione = idRegione;
		Regione = regione;
	}
	
	

}
