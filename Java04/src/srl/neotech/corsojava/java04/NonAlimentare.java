package srl.neotech.corsojava.java04;

public class NonAlimentare extends Prodotto {
	
	private String materiale;

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	public String calcoloMateriale() {
		String tipoMateriale = null;
		if (materiale=="plastica") tipoMateriale = "metallo";
		return tipoMateriale;
	}

}
