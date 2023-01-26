package srl.neotech.model;

public class Comune {
	
	private Integer idComune;
	private String Comune;
	
	public Integer getIdComune() {
		return idComune;
	}
	public void setIdComune(Integer idComune) {
		this.idComune = idComune;
	}
	public String getComune() {
		return Comune;
	}
	public void setComune(String comune) {
		Comune = comune;
	}
	
	public Comune(Integer idComune, String comune) {
		this.idComune = idComune;
		Comune = comune;
	}
	

}
