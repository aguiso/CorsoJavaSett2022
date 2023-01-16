package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Automobile;

public class GetListaAutomobiliResponse extends ResponseBase{
	
	private ArrayList<Automobile> automobili=new ArrayList<Automobile>();

	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setElementi(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	

}
