package srl.neotech.corsojava.aeroporto;

import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Aeroporto aeroporto = new Aeroporto();
		Faker faker = new Faker();
		
		for (int i=0; i<100; i++) {
			Aereo aereiInPartenza = new Aereo();
			
			/* Assegno id Numerico all'aereoporto casualmente */
			Integer idAereo = faker.number().randomDigit();
			aereiInPartenza.setIdUnivoco(idAereo);
			
			/* Assegno orario arbitrario ad ogni singolo aereo */
			Integer orarioPartenza = faker.date().hashCode();
			aereiInPartenza.setOrario(orarioPartenza);
			
			/* Indicazione modello aereo */
			String costruttore = faker.space().company();
			aereiInPartenza.getModello().setCostruttore(costruttore);
			String codiceModello = faker.code().ean8();
			aereiInPartenza.getModello().setCodiceModello(codiceModello);
			Integer numeroPasseggeri = faker.number().numberBetween(1, 100);
			aereiInPartenza.getModello().setCapienzaNumPasseggeri(numeroPasseggeri);
			
			/* Assegno compagnia aerea casualmente */
			String compagniaAerea = faker.company().name();
			aereiInPartenza.setCompagniaAerea(compagniaAerea);
			
			/* Assegno distanza dall'aereoporto casualmente */
			Integer distanzaCasuale = faker.number().numberBetween(1, 500);
			aereiInPartenza.setDistanzaDallAeroporto(distanzaCasuale);
			
			aeroporto.getAerei().add(aereiInPartenza);
			
		}
		
		for (int j=0; j<200; j++) {
			Aereo aereiInAvvicinamento = new Aereo();
			
			/* Assegno id Numerico all'aereoporto casualmente */
			Integer idAereo = faker.number().randomDigit();
			aereiInAvvicinamento.setIdUnivoco(idAereo);
			
			/* Assegno orario arbitrario ad ogni singolo aereo */
			Integer orarioPartenza = faker.date().hashCode();
			aereiInAvvicinamento.setOrario(orarioPartenza);
			
			/* Indicazione modello aereo */
			String costruttore = faker.space().company();
			aereiInAvvicinamento.getModello().setCostruttore(costruttore);
			String codiceModello = faker.code().ean8();
			aereiInAvvicinamento.getModello().setCodiceModello(codiceModello);
			Integer numeroPasseggeri = faker.number().numberBetween(1, 100);
			aereiInAvvicinamento.getModello().setCapienzaNumPasseggeri(numeroPasseggeri);
			
			/* Assegno compagnia aerea casualmente */
			String compagniaAerea = faker.company().name();
			aereiInAvvicinamento.setCompagniaAerea(compagniaAerea);
			
			/* Assegno distanza dall'aereoporto casualmente */
			Integer distanzaCasuale = faker.number().numberBetween(1, 500);
			aereiInAvvicinamento.setDistanzaDallAeroporto(distanzaCasuale);
			
			aeroporto.getAerei().add(aereiInAvvicinamento);
			
		}
		
		for (int k=0; k<1000; k++) {
			Passeggero passeggero = new Passeggero();
			
			/* Assegno id Numerico al passeggero casualmente */
			Integer idPasseggero = faker.number().randomDigit();
			passeggero.setIdUnivoco(idPasseggero);
			
			/* Definizione passeggero Maschio o Femmina */
			int numeroCasuale = rnd.nextInt(1,2) +1;
			
			if (numeroCasuale == 1 ) passeggero.setMF('M');
			if (numeroCasuale == 2 ) passeggero.setMF('F');
			
			/* Scelta eta casuale */
			Integer eta = faker.number().numberBetween(1, 100);
			passeggero.setEta(eta);
			
			/* Passeggeri con o senza bagagli */
			
			aeroporto.getPasseggeri().add(passeggero);
			
		}	
			
		for (Aereo aP: aeroporto.getAerei()) {
			System.out.println(aP);
		}
		
		for (Aereo aA: aeroporto.getAerei()) {
			System.out.println(aA);
		}
		
		for (Passeggero p: aeroporto.getPasseggeri()) {
			System.out.println(p);
		}

	}

}
