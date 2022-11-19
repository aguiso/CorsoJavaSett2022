package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;

public class Aeroporto {
	
	private ArrayList<Aereo> aerei = new ArrayList<Aereo>();
	
	private ArrayList<Passeggero> passeggeri = new ArrayList<Passeggero>();
	
	/* spazio aereo da 1 a 100 km */
	private Integer raggioDiAzione;

	public ArrayList<Aereo> getAerei() {
		return aerei;
	}

	public void setAerei(ArrayList<Aereo> aerei) {
		this.aerei = aerei;
	}

	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	

}
