package srl.neotech.corsojava.aeroporto;

public class Passeggero {
	
	private Integer idUnivoco;
	private Character MF; // MF ---> Passeggero maschio o femmina
	private Boolean hasFiore;
	private Integer eta;
	private Boolean haBagagli;
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Character getMF() {
		return MF;
	}
	public void setMF(Character mF) {
		MF = mF;
	}
	public Boolean getHasFiore() {
		return hasFiore;
	}
	public void setHasFiore(Boolean hasFiore) {
		this.hasFiore = hasFiore;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public Boolean getHaBagagli() {
		return haBagagli;
	}
	public void setHaBagagli(Boolean haBagagli) {
		this.haBagagli = haBagagli;
	}
	
	@Override
	public String toString() {
		return "Passeggero [idUnivoco=" + idUnivoco + ", MF=" + MF + ", hasFiore=" + hasFiore + ", eta=" + eta
				+ ", haBagagli=" + haBagagli + "]";
	}
	
	

}
