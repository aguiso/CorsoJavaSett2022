package srl.neotech.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Autosalone {
	
	private ArrayList<Automobile> automobili= new ArrayList<Automobile>();
	
	public Autosalone() {
		//prima auto
		Automobile primaAuto=new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("BR556TY");
		primaAuto.setColore(EColore.BLU);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2021");
		primaAuto.setCostruttore(ECostruttore.BUGATTI);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));
		
		Accessorio cerchiLega=new Accessorio();
		cerchiLega.setClasse(EClassAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));
		
		primaAuto.getAccessori().add(cerchiLega);
		automobili.add(primaAuto);
		//seconda auto
		Automobile secondaAuto=new Automobile();
		secondaAuto.setId("2");
		secondaAuto.setTarga("GG555FA");
		secondaAuto.setColore(EColore.ROSSO);
		secondaAuto.setAlimentazione(EAlimentazione.BENZINA);
		secondaAuto.setAnnoCostruzione("2020");
		secondaAuto.setCostruttore(ECostruttore.FERRARI);
		secondaAuto.setModello("Purosangue");
		secondaAuto.setCosto(new BigDecimal("385000.00"));
		
		Accessorio carPlay=new Accessorio();
		carPlay.setClasse(EClassAccessorio.INTERNI);
		carPlay.setTipologia(ETipologiaAccessorio.INFOTEINMENT);
		carPlay.setCosto(new BigDecimal("1500.00"));
		
		secondaAuto.getAccessori().add(carPlay);
		automobili.add(secondaAuto);
		//terza auto
		Automobile terzaAuto=new Automobile();
		terzaAuto.setId("3");
		terzaAuto.setTarga("ES666AM");
		terzaAuto.setColore(EColore.BIANCO);
		terzaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		terzaAuto.setAnnoCostruzione("2022");
		terzaAuto.setCostruttore(ECostruttore.PORSCHE);
		terzaAuto.setModello("Panamera");
		terzaAuto.setCosto(new BigDecimal("150000.00"));
		
		Accessorio androidAuto=new Accessorio();
		androidAuto.setClasse(EClassAccessorio.INTERNI);
		androidAuto.setTipologia(ETipologiaAccessorio.INFOTEINMENT);
		androidAuto.setCosto(new BigDecimal("1200.00"));
		
		terzaAuto.getAccessori().add(androidAuto);
		automobili.add(terzaAuto);
		//quarta auto
		Automobile quartaAuto=new Automobile();
		quartaAuto.setId("4");
		quartaAuto.setTarga("FA566TT");
		quartaAuto.setColore(EColore.NERO);
		quartaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		quartaAuto.setAnnoCostruzione("2018");
		quartaAuto.setCostruttore(ECostruttore.MASERATI);
		quartaAuto.setModello("Ghibli");
		quartaAuto.setCosto(new BigDecimal("130000.00"));
		
		Accessorio tettoApribile=new Accessorio();
		tettoApribile.setClasse(EClassAccessorio.ESTERNI);
		tettoApribile.setTipologia(ETipologiaAccessorio.TETTUCCIO);
		tettoApribile.setCosto(new BigDecimal("3700.00"));
		
		quartaAuto.getAccessori().add(tettoApribile);
		automobili.add(quartaAuto);
		//quinta auto
		Automobile quintaAuto=new Automobile();
		quintaAuto.setId("5");
		quintaAuto.setTarga("GG989DF");
		quintaAuto.setColore(EColore.NERO);
		quintaAuto.setAlimentazione(EAlimentazione.BENZINA);
		quintaAuto.setAnnoCostruzione("2022");
		quintaAuto.setCostruttore(ECostruttore.LAMBORGHINI);
		quintaAuto.setModello("Aventador");
		quintaAuto.setCosto(new BigDecimal("350000.00"));
		
		Accessorio telecamere=new Accessorio();
		telecamere.setClasse(EClassAccessorio.SICUREZZA);
		telecamere.setTipologia(ETipologiaAccessorio.TELECAMERE);
		telecamere.setCosto(new BigDecimal("1500.00"));
		
		quintaAuto.getAccessori().add(telecamere);
		automobili.add(quintaAuto);
		
	}

	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	
	
}
