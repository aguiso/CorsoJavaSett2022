package srl.neotech.corsojava.costruttori;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cupcake ilMioCupcake = new Cupcake();
		ilMioCupcake.colore="Rosa";
		ilMioCupcake.ripieno="Merda";
		System.out.println("Il mio cupcake è di colore: "+ilMioCupcake.colore+" e il ripieno è: "+ilMioCupcake.ripieno);
		
		Cupcake cupcakeDiMatteo = new Cupcake("Crema");
		cupcakeDiMatteo.colore="Blu";
		cupcakeDiMatteo.decorazione.ingrediente="Cioccolato";
		cupcakeDiMatteo.decorazione.tipoDecorazione="Stelline";
		System.out.println("Il cupcake di Matteo è di colore: "+cupcakeDiMatteo.colore+" e il ripieno è: "+cupcakeDiMatteo.ripieno);

	}

}
