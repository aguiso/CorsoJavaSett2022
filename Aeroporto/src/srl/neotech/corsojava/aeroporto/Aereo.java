package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aereo {
	
	private Integer idUnivoco;
	private Integer orario; // L'orario è espresso in minuti casuali (es. 10, 50, 130, 80, 70)
	private String compagniaAerea;
	private ModelloAereo modello;
	private List<Passeggero> passeggeri;
	private Integer velocità; // da 1 a 10
	private Integer distanzaDallAeroporto; // da 1 a 500
	private StatoAereo stato;
	
	public Aereo() {
		passeggeri = new ArrayList<Passeggero>();
	}
	
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public StatoAereo getStato() {
		return stato;
	}
	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}
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

	@Override
	public String toString() {
		return "Aereo [idUnivoco=" + idUnivoco + ", orario=" + orario + ", compagniaAerea=" + compagniaAerea
				+ ", modello=" + modello + ", passeggeri=" + passeggeri + ", velocità=" + velocità
				+ ", distanzaDallAeroporto=" + distanzaDallAeroporto + ", stato=" + stato + "]";
	} 
	
	
	
}
