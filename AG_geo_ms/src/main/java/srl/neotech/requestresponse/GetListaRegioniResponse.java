package srl.neotech.requestresponse;

import java.util.ArrayList;
import java.util.List;

import srl.neotech.model.Regione;

public class GetListaRegioniResponse extends ResponseBase {
	
	private List<Regione> regioni=new ArrayList<Regione>();

	public List<Regione> getRegioni() {
		return regioni;
	}

	public void setRegioni(List<Regione> regioni) {
		this.regioni = regioni;
	}
	
}
