package srl.neotech.corsojava.aeroporto;

public class Aereo {
	
	private Integer idUnivoco;
	private Integer orario; // L'orario è espresso in minuti casuali (es. 10, 50, 130, 80, 70)
	private String compagniaAerea;
	private ModelloAereo modello;
	private Passeggero passeggeri;
	private Integer velocità; // da 1 a 10
	private Integer distanzaDallAeroporto; // da 1 a 500
	private Stato stato;
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public String getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	public ModelloAereo getModello() {
		return modello;
	}
	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}
	public Passeggero getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(Passeggero passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getVelocità() {
		return velocità;
	}
	public void setVelocità(Integer velocità) {
		this.velocità = velocità;
	}
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}
	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	} 
	
}
