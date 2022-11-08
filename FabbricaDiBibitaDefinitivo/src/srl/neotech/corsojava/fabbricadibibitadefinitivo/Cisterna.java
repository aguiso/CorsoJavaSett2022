package srl.neotech.corsojava.fabbricadibibitadefinitivo;

public class Cisterna {
	
	private String tipologia;
	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	private Integer theshold; 
	
	
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
	}
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas(Integer livelloGas) {
		this.livelloGas = livelloGas;
	}
	
	public Integer getTheshold() {
		return theshold;
	}
	public void setTheshold(Integer theshold) {
		this.theshold = theshold;
	}
		
	@Override
	public String toString() {
		return "Cisterna [materiale=" + tipologia + ", quantita=" + quantita + ", evapPerDay=" + evapPerDay
				+ ", livelloGas=" + livelloGas + "]";
	}
	
	
	

}
