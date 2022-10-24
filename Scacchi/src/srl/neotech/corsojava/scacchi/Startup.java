package srl.neotech.corsojava.scacchi;

public class Startup {

	public static void main(String[] args) {
		
		/* Creo l'oggetto in memoria tramite l'operatore "new"; */
		
		Partita p = new Partita();
		p.getG1().setNome("Massimiliano");
		p.getG2().setNome("Matteo");

		for (int i=0; i<64; i++) {
			Cella c = new Cella();
			
			if (i%2==0) c.setColore("Bianco");
			else        c.setColore("Nero");
			
			if(i<15) {
				Pezzo pezzo = null;
				switch (i) {
				case 0: 
					pezzo = new Torre();
					c.setPezzo(pezzo);
					break;
				case 1: 
					pezzo = new Cavallo();
					c.setPezzo(pezzo);
					break;
				case 2: 
					pezzo = new Alfiere();
					c.setPezzo(pezzo);
					break;
				case 3: 
					pezzo = new Regina();
					c.setPezzo(pezzo);
					break;
				case 4: 
					pezzo = new Re();
					c.setPezzo(pezzo);
					break;	
				default: 
					pezzo = new Pedone();
					c.setPezzo(pezzo);
					break;	
				}
			}
			
			p.getTavolo().getCelle().add(c);
		}
		
		for (Cella cellaSullaScacchiera: p.getTavolo().getCelle()) {
			if(cellaSullaScacchiera.getPezzo() instanceof Pedone) System.out.println("Sulla scacchiera è presente un Pedone");
			if(cellaSullaScacchiera.getPezzo() instanceof Torre) System.out.println("Sulla scacchiera è presente una Torre");
			if(cellaSullaScacchiera.getPezzo() instanceof Cavallo) System.out.println("Sulla scacchiera è presente un Cavallo");
			if(cellaSullaScacchiera.getPezzo() instanceof Alfiere) System.out.println("Sulla scacchiera è presente un Alfiere");
			if(cellaSullaScacchiera.getPezzo() instanceof Regina) System.out.println("Sulla scacchiera è presente una Regina");
			if(cellaSullaScacchiera.getPezzo() instanceof Re) System.out.println("Sulla scacchiera è presente un Re");
		}
	}
}