package srl.neotech.corsojava.gestionebiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> libri = new ArrayList<Libro>();
	private ArrayList<Associato> associati = new ArrayList<Associato>();
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	public void setLibri(ArrayList<Libro> libri) {
		this.libri = libri;
	}
	public ArrayList<Associato> getAssociati() {
		return associati;
	}
	public void setAssociati(ArrayList<Associato> associati) {
		this.associati = associati;
	}
	
	

}
