package srl.neotech.corsojava.java04;

public class Alimentare extends Prodotto {
	
	private int dataDiScadenza;

	public int getDataDiScadenza() {
		return dataDiScadenza;
	}

	public void setDataDiScadenza(int dataDiScadenza) {
		this.dataDiScadenza = dataDiScadenza;
	} 
	
	public String calcoloScadenza() {
		String tipoScadenza = null;
		if ( dataDiScadenza > 100) tipoScadenza = "prodotto alimentare";
		if ( dataDiScadenza < 100) tipoScadenza = "prodotto non alimentare";
		return tipoScadenza;
		
	}
}
