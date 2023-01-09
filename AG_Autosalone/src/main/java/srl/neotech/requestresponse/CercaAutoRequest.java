package srl.neotech.requestresponse;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;

public class CercaAutoRequest {

	private Integer id;
	@Min(7)
	@Max(7)
	@NotBlank
	private String targa;

	private ECostruttore costruttore;
	private String modello;
	private String alimentazione;
	private Integer annoCostruzione;
	private Integer costo;
	private EColore colore;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public ECostruttore getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(ECostruttore costruttore) {
		this.costruttore = costruttore;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public Integer getAnnoCostruzione() {
		return annoCostruzione;
	}
	public void setAnnoCostruzione(Integer annoCostruzione) {
		this.annoCostruzione = annoCostruzione;
	}
	public Integer getCosto() {
		return costo;
	}
	public void setCosto(Integer costo) {
		this.costo = costo;
	}
	public EColore getColore() {
		return colore;
	}
	public void setColore(EColore colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "CercaAutoRequest [id=" + id + ", targa=" + targa + ", costruttore=" + costruttore + ", modello="
				+ modello + ", alimentazione=" + alimentazione + ", annoCostruzione=" + annoCostruzione + ", costo="
				+ costo + ", colore=" + colore + "]";
	}



}
