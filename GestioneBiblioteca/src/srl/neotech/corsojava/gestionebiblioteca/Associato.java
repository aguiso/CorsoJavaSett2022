package srl.neotech.corsojava.gestionebiblioteca;

public class Associato extends Biblioteca {
	
	Integer idAssociato;
	String nominativo;
	String stato;
	String listaDiLibriPresi;
	
	public Integer getIdAssociato() {
		return idAssociato;
	}
	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getListaDiLibriPresi() {
		return listaDiLibriPresi;
	}
	public void setListaDiLibriPresi(String listaDiLibriPresi) {
		this.listaDiLibriPresi = listaDiLibriPresi;
	}
	
	@Override
	public String toString() {
		return "Associato [idAssociato=" + idAssociato + ", nominativo=" + nominativo + ", stato=" + stato
				+ ", listaDiLibriPresi=" + listaDiLibriPresi + "]";
	}
	
}
