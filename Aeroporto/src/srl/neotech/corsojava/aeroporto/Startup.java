package srl.neotech.corsojava.aeroporto;

import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto();
		
		/* Creazione Aerei in volo (AVVICINAMENTO) */
		Random rnd = new Random();
		Faker faker = new Faker();
		
		for (int i=0; i<200; i++) {
			Aereo areiInAvvicinamento = new Aereo();
			
			/* Assegno distanza dall'aeroporto */
			areiInAvvicinamento.setDistanzaDallAeroporto(rnd.nextInt(100));
			
			/* Assegno id Numerico all'aereoporto */
			areiInAvvicinamento.setIdUnivoco(i);
			
			/* Assegno orario di partenza */
			areiInAvvicinamento.setOrario(rnd.nextInt(500));
			
			/* Assegno compagnia arbitraria ad ogni singolo aereo */
			areiInAvvicinamento.setCompagniaAerea(faker.company().name());
			
			/* Velocità aereo */
			areiInAvvicinamento.setVelocità(rnd.nextInt(1,100));
			
			/* Indicazione modello aereo */
			ModelloAereo modello = new ModelloAereo();
			modello.setCapienza(rnd.nextInt(200));
			modello.setCostruttore(faker.company().name());
			modello.setCodiceModello(faker.code().isbn13());
			areiInAvvicinamento.setModello(modello);
			
			/* Stato aereo */
			areiInAvvicinamento.setStato(StatoAereo.IN_AVVICINAMENTO);
			
			//Popolamento passeggeri in volo
			
			for (int j=0; j<modello.getCapienza(); j++) {
				Passeggero p=null;
				Integer tipoPasseggero = rnd.nextInt(2);
				if (tipoPasseggero == 0) p = new Excelsior();
				if (tipoPasseggero == 1) p = new Business();
				if (tipoPasseggero == 2) p = new Turista();
				
				p.setEta(rnd.nextInt(100));
				p.setIdUnivoco(j);
				Integer sceltaMF = rnd.nextInt(1);
				if (sceltaMF == 0 ) p.setMF('M');
				if (sceltaMF == 1 ) p.setMF('F');
				p.setHaBagagli(false);
				p.setHasFiore(false);
				
				areiInAvvicinamento.getPasseggeri().add(p);
			}
			
			/* Assegno distanza dall'aereoporto casualmente */
			Integer distanzaCasuale = faker.number().numberBetween(1, 500);
			areiInAvvicinamento.setDistanzaDallAeroporto(distanzaCasuale);
			
			aeroporto.getAereiInPartenza().add(areiInAvvicinamento);
		}
		
		for (int j=0; j<100; j++) {
			Aereo aereiInPartenza = new Aereo();
			
			/* Assegno distanza dall'aeroporto */
			aereiInPartenza.setDistanzaDallAeroporto(rnd.nextInt(100));
			
			/* Assegno id Numerico all'aereoporto */
			aereiInPartenza.setIdUnivoco(j);
			
			/* Assegno orario di partenza */
			aereiInPartenza.setOrario(rnd.nextInt(500));
			
			/* Assegno compagnia arbitraria ad ogni singolo aereo */
			aereiInPartenza.setCompagniaAerea(faker.company().name());
			
			/* Velocità aereo */
			aereiInPartenza.setVelocità(rnd.nextInt(1,100));
			
			/* Indicazione modello aereo */
			ModelloAereo modello = new ModelloAereo();
			modello.setCapienza(rnd.nextInt(200));
			modello.setCostruttore(faker.company().name());
			modello.setCodiceModello(faker.code().isbn13());
			aereiInPartenza.setModello(modello);
			
			/* Stato aereo */
			aereiInPartenza.setStato(StatoAereo.IN_PARTENZA);
			
		}
		
		for (int k=0; k<1000; k++) {
			Passeggero passeggeriInAttesa = new Passeggero();
			
			/* Assegno id Numerico al passeggero casualmente */
			passeggeriInAttesa.setIdUnivoco(k);
			
			Passeggero p=null;
			Integer tipoPasseggero = rnd.nextInt(2);
			if (tipoPasseggero == 0) p = new Excelsior();
			if (tipoPasseggero == 1) p = new Business();
			if (tipoPasseggero == 2) p = new Turista();
			
			/* Definizione sesso passeggero Maschio o Femmina */
			Integer sceltaMF = rnd.nextInt(1);
			if (sceltaMF == 0 ) passeggeriInAttesa.setMF('M');
			if (sceltaMF == 1 ) passeggeriInAttesa.setMF('F');
			
			/* Scelta eta casuale */
			passeggeriInAttesa.setEta(faker.number().numberBetween(1, 100));
			
			/* Passeggeri con o senza bagagli */
			passeggeriInAttesa.setHaBagagli(false);
			passeggeriInAttesa.setHasFiore(false);
			
			aeroporto.getPasseggeri().add(passeggeriInAttesa);
			
		}	
		
		/* far atterrare tutti gli aerei , quando l'aereo atterra si fa il checkout */
		for (Aereo a: aeroporto.getAereiInAvvicinamento()) {
			System.out.println(a);
		}
		
		/* far decollare tutti gli aerei , riempire l'aereo e poi decollo */	
		for (Aereo aP: aeroporto.getAereiInPartenza()) {
			System.out.println(aP);
		}
		
	
		for (Passeggero p: aeroporto.getPasseggeri()) {
			System.out.println(p);
		}

	}

}
