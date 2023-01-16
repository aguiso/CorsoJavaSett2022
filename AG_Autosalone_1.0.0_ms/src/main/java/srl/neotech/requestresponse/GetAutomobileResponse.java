package srl.neotech.requestresponse;

import srl.neotech.model.Automobile;

public class GetAutomobileResponse extends ResponseBase{
	
	private Automobile automobile;

	public Automobile getAutomobile() {
		return automobile;
	}

	public void setElemento(Automobile automobile) {
		this.automobile = automobile;
	}
	
	

}
