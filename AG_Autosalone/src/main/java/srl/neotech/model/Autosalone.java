package srl.neotech.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Autosalone {

	private ArrayList<Automobile> automobili= new ArrayList<>();

	public Autosalone() {
		//prima auto
		Automobile primaAuto=new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("BR556TY");
		primaAuto.setColore(EColore.Blu);
		primaAuto.setAlimentazione(EAlimentazione.Ibrido);
		primaAuto.setAnnoCostruzione("2021");
		primaAuto.setCostruttore(ECostruttore.Bugatti);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));

		Accessorio cerchiLega=new Accessorio();
		cerchiLega.setClasse(EClassAccessorio.Esterni);
		cerchiLega.setTipologia(ETipologiaAccessorio.Cerchi);
		cerchiLega.setCosto(new BigDecimal("3700.34"));

		primaAuto.getAccessori().add(cerchiLega);
		automobili.add(primaAuto);
		//seconda auto
		Automobile secondaAuto=new Automobile();
		secondaAuto.setId("2");
		secondaAuto.setTarga("GG555FA");
		secondaAuto.setColore(EColore.Rosso);
		secondaAuto.setAlimentazione(EAlimentazione.Benzina);
		secondaAuto.setAnnoCostruzione("2020");
		secondaAuto.setCostruttore(ECostruttore.Ferrari);
		secondaAuto.setModello("Purosangue");
		secondaAuto.setCosto(new BigDecimal("385000.00"));

		Accessorio carPlay=new Accessorio();
		carPlay.setClasse(EClassAccessorio.Interni);
		carPlay.setTipologia(ETipologiaAccessorio.Infoteinment);
		carPlay.setCosto(new BigDecimal("1500.00"));

		secondaAuto.getAccessori().add(carPlay);
		automobili.add(secondaAuto);
		//terza auto
		Automobile terzaAuto=new Automobile();
		terzaAuto.setId("3");
		terzaAuto.setTarga("ES666AM");
		terzaAuto.setColore(EColore.Bianco);
		terzaAuto.setAlimentazione(EAlimentazione.Ibrido);
		terzaAuto.setAnnoCostruzione("2022");
		terzaAuto.setCostruttore(ECostruttore.Porsche);
		terzaAuto.setModello("Panamera");
		terzaAuto.setCosto(new BigDecimal("150000.00"));

		Accessorio androidAuto=new Accessorio();
		androidAuto.setClasse(EClassAccessorio.Interni);
		androidAuto.setTipologia(ETipologiaAccessorio.Infoteinment);
		androidAuto.setCosto(new BigDecimal("1200.00"));

		terzaAuto.getAccessori().add(androidAuto);
		automobili.add(terzaAuto);
		//quarta auto
		Automobile quartaAuto=new Automobile();
		quartaAuto.setId("4");
		quartaAuto.setTarga("FA566TT");
		quartaAuto.setColore(EColore.Nero);
		quartaAuto.setAlimentazione(EAlimentazione.Ibrido);
		quartaAuto.setAnnoCostruzione("2018");
		quartaAuto.setCostruttore(ECostruttore.Maserati);
		quartaAuto.setModello("Ghibli");
		quartaAuto.setCosto(new BigDecimal("130000.00"));

		Accessorio tettoApribile=new Accessorio();
		tettoApribile.setClasse(EClassAccessorio.Esterni);
		tettoApribile.setTipologia(ETipologiaAccessorio.Tettuccio);
		tettoApribile.setCosto(new BigDecimal("3700.00"));

		quartaAuto.getAccessori().add(tettoApribile);
		automobili.add(quartaAuto);
		//quinta auto
		Automobile quintaAuto=new Automobile();
		quintaAuto.setId("5");
		quintaAuto.setTarga("GG989DF");
		quintaAuto.setColore(EColore.Giallo);
		quintaAuto.setAlimentazione(EAlimentazione.Benzina);
		quintaAuto.setAnnoCostruzione("2022");
		quintaAuto.setCostruttore(ECostruttore.Lamborghini);
		quintaAuto.setModello("Aventador");
		quintaAuto.setCosto(new BigDecimal("350000.00"));

		Accessorio telecamere=new Accessorio();
		telecamere.setClasse(EClassAccessorio.Sicurezza);
		telecamere.setTipologia(ETipologiaAccessorio.Telecamere);
		telecamere.setCosto(new BigDecimal("1500.00"));

		quintaAuto.getAccessori().add(telecamere);
		automobili.add(quintaAuto);

	}

	public Automobile getAutomobile(String id) {

		for (Automobile auto : automobili) {

			if (auto.getId().equals(id)) {
				return auto;
			}
		}
		return null;
	}

	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}



}
