package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;

public class Aeroporto {
	
	private ArrayList<Aereo> aereiInPartenza = new ArrayList<Aereo>();
	private ArrayList<Aereo> aereiInAvvicinamento = new ArrayList<Aereo>();
	private ArrayList<Passeggero> passeggeriInAttesa = new ArrayList<Passeggero>();
	
	/* spazio aereo da 1 a 100 km */
	private Integer raggioAzione;

	public ArrayList<Aereo> getAereiInPartenza() {
		return aereiInPartenza;
	}

	public void setAereiInPartenza(ArrayList<Aereo> aereiInPartenza) {
		this.aereiInPartenza = aereiInPartenza;
	}

	public ArrayList<Aereo> getAereiInAvvicinamento() {
		return aereiInAvvicinamento;
	}

	public void setAereiInAvvicinamento(ArrayList<Aereo> aereiInAvvicinamento) {
		this.aereiInAvvicinamento = aereiInAvvicinamento;
	}

	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeriInAttesa;
	}

	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeriInAttesa = passeggeri;
	}

	public Integer getRaggioAzione() {
		return raggioAzione;
	}

	public void setRaggioAzione(Integer raggioAzione) {
		this.raggioAzione = raggioAzione;
	}
	
	/* prende un aereo in arrivo e lo fa decollare */
	public Aereo atterraggio (Aereo a) {
		
		/* ciclo riducendo la distanza per la velocità finchè la distanza dall'aeroporto è <1 */
		while (a.getDistanzaDallAeroporto()>1) {
			Integer distanzaAttuale = a.getDistanzaDallAeroporto() - a.getVelocità();
			System.out.println("Blink!: "+a);
			a.setDistanzaDallAeroporto(distanzaAttuale);
		}
		a.setStato(StatoAereo.ATTERRATO);
		System.out.println(a);
		for (Passeggero p:a.getPasseggeri()) {
			this.checkout(p);
		}
		return a;
	}
	
	/* prende un aereo in partenza e torna un aereo decollato */
	public Aereo decollo (Aereo a) {
		while(a.getDistanzaDallAeroporto()<this.raggioAzione) {
			Integer distanzaAttuale = a.getDistanzaDallAeroporto() + a.getVelocità();
			System.out.println("Blink!: "+a);
			a.setDistanzaDallAeroporto(distanzaAttuale);
		}
		a.setStato(StatoAereo.IN_PARTENZA);
		System.out.println(a);
		for (Passeggero p:a.getPasseggeri()) {
			this.checkout(p);
		}
		
		return a;
	}
	
	/* Checkout passeggeri */
	public Passeggero checkout (Passeggero p) {
		if (p instanceof Excelsior) ((Excelsior) p).setHaChampagne(true);
		if (p instanceof Business) ((Business) p).setHaGiornale(true);
		if (p instanceof Turista) ((Turista) p).setHaAnimale(true);
		return p;
	}

	@Override
	public String toString() {
		return "Aeroporto [aereiInPartenza=" + aereiInPartenza + ", aereiInAvvicinamento=" + aereiInAvvicinamento
				+ ", passeggeri=" + passeggeriInAttesa + ", raggioDiAzione=" + raggioAzione + "]";
	}
	
	
}	
