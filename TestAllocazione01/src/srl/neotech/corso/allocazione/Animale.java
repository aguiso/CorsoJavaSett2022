package srl.neotech.corso.allocazione;

public class Animale {
	
	
	// se aggiungo "private" alle varibabili le rendo non visibili all'esterno della classe!!!
	
	//Attributi della classe
	public int eta;
	public int numeroZampe;
	public boolean haLaCoda;
	
	
	//Metodi, che rappresentano le azioni svolte dalla classe 
	public void calcoloEtaTotale() {
		this.eta=6; 
	}

	
	//---FIRMA METODO---
	//modificatore tipoRitorno nomeMetodo        //parametri
	public         String      calcoloTipoAnimale(           ) {
		String tipoAnimaleRestituito=null;
		
		if(this.numeroZampe<1) tipoAnimaleRestituito="E' una lumaca ";
		if(this.numeroZampe==2) tipoAnimaleRestituito="E' un uccello ";
		if(this.numeroZampe==4) tipoAnimaleRestituito="E' un gatto ";
		if(this.numeroZampe==8) tipoAnimaleRestituito="E' un ragno ";
		if(this.numeroZampe>8) tipoAnimaleRestituito="E' un millepiedi ";
		return tipoAnimaleRestituito;
	}
	
}
