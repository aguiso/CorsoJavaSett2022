package srl.neotech.corsojava.aeroporto;

public class ModelloAereo {
	
	private String costruttore;
	private String codiceModello;
	private Integer capienza;
	
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	public String getCodiceModello() {
		return codiceModello;
	}
	public void setCodiceModello(String codiceModello) {
		this.codiceModello = codiceModello;
	}
	public Integer getCapienza() {
		return capienza;
	}
	public void setCapienza(Integer capienza) {
		this.capienza = capienza;
	}
	@Override
	public String toString() {
		return "ModelloAereo [costruttore=" + costruttore + ", codiceModello=" + codiceModello
				+ ", capienzaNumPasseggeri=" + capienza + "]";
	}
	
	
	
}
