package srl.neotech.corsojava.gestionebiblioteca;

import java.util.ArrayList;
import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {
	
	static ArrayList<Libro> libri = new ArrayList<Libro>();

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Faker faker = new Faker();
		
		for (int i=0; i<100; i++) {
			Libro libro = new Libro();
			int numeroCasuale = rnd.nextInt(1,101) +1;
			
			String autore = faker.book().author();
			String scaffale = faker.book().publisher();
			String sezione = faker.book().genre();
			String titolo = faker.book().title();
			
			libro.setAutore(autore);
			libro.setIdLibro(numeroCasuale);
			libro.setScaffale(scaffale);
			libro.setSezione(sezione);
			libro.setTitolo(titolo);
			
			libri.add(libro);
		}
		
		for (int j=0; j<100; j++) {
			Associato associato = new Associato();
			int numeroCasuale = rnd.nextInt(1,101) +1;
			
			String listaLibri = faker.book().title();
			String nome = faker.name().fullName();
			
			associato.setIdAssociato(numeroCasuale);
			associato.setListaDiLibriPresi(listaLibri);
			associato.setNominativo(nome);
			associato.setStato();
						
			libri.add(associato);
			
		}

	}

}
