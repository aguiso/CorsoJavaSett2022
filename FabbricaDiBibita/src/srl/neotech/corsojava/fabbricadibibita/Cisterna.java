package srl.neotech.corsojava.fabbricadibibita;

import java.util.Random;

public class Cisterna {
	
	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
	}
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas(Integer livelloGas) {
		this.livelloGas = livelloGas;
	}
	
	public Cisterna tipoCisterna() {
		Random r = new Random();
		int low = 1;
		int high = 3;
		int result = r.nextInt(high - low) + low;
		
		Cisterna cist = null;
		if (result == 1 ) {
			cist = new CisternaAlluminio();
		}
		if (result == 2 ) {
			cist = new CisternaRame();
		}
		if (result == 3 ) {
			cist = new CisternaAcciaio();
		}
		
		return cist;
		
	}

}
