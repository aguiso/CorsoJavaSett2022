package srl.neotech.corsojava.scacchimassi;

public class Startup {

	public static void main(String[] args) {
		
		Partita p = new Partita();
		
		/* 
		 * Giocatore g1 = new Giocatore();
		 * Giocatore g2 = new Giocatore();
		 * TavoloDaGioco tavolo = new TavoloDaGioco();
		 */
		
		p.getG1().setNome("Massimiliano");
		p.getG1().setNome("Matteo");
		
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
					pezzo = new Alfiere();
					c.setPezzo(pezzo);
					break;
				case 2:
					pezzo = new Cavallo();
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
					
				if (i>48) {
					Pezzo pezzo1 = null;
					switch (i) {
					case 0:
						pezzo1 = new Torre();
						c.setPezzo(pezzo1);
						break;
					case 1:
						pezzo1 = new Alfiere();
						c.setPezzo(pezzo1);
						break;
					case 2:
						pezzo1 = new Cavallo();
						c.setPezzo(pezzo1);
						break;	
					case 3:
						pezzo1 = new Regina();
						c.setPezzo(pezzo1);
						break;	
					case 4:
						pezzo1 = new Re();
						c.setPezzo(pezzo1);
						break;		

					default:
						pezzo1 = new Pedone();
						c.setPezzo(pezzo1);
						break;
					}	
				}
			}
			
			p.getUnTavolo().getCelle().add(c);
		}
		
		for (Cella pezzoSullaScacchiera: p.getUnTavolo().getCelle()) {
			if(pezzoSullaScacchiera.getPezzo() instanceof Torre) System.out.println("Sulla scacchiera c'è una Torre");
			if(pezzoSullaScacchiera.getPezzo() instanceof Alfiere) System.out.println("Sulla scacchiera c'è una Alfiere");
			if(pezzoSullaScacchiera.getPezzo() instanceof Cavallo) System.out.println("Sulla scacchiera c'è una Cavallo");
			if(pezzoSullaScacchiera.getPezzo() instanceof Regina) System.out.println("Sulla scacchiera c'è una Regina");
			if(pezzoSullaScacchiera.getPezzo() instanceof Re) System.out.println("Sulla scacchiera c'è una Re");
			if(pezzoSullaScacchiera.getPezzo() instanceof Pedone) System.out.println("Sulla scacchiera c'è una Pedone");
		}
	}
	
}
