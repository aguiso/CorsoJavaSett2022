package srl.neotech.model;

public class Provincia {
	
	private String sigla;
	private String Provincia;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public Provincia(String sigla, String provincia) {
		this.sigla = sigla;
		Provincia = provincia;
	}
	
	
}
