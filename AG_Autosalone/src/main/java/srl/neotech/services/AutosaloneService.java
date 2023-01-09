package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.requestresponse.CercaAutoRequest;

@Service
public class AutosaloneService {

	@Autowired
	Autosalone autoSalone;

	//remove
	public void removeAuto (String id) {
		int indice=0;
		for (int i=0; i<autoSalone.getAutomobili().size(); i++) {
			if (autoSalone.getAutomobili().get(i).getId().equals(id)) indice=i;
		}
		if(indice>=0) autoSalone.getAutomobili().remove(indice);
	}

	//details
	public void dettaglioAuto (String id) {
		for (Automobile auto: autoSalone.getAutomobili()) {
			if (auto.getId().equals(id)) auto.getAccessori();
		}
	}

	//search
	public List<Automobile> ricercaAutomobili(CercaAutoRequest request) {
		List<Automobile> autoTrovate = new ArrayList<>();
		if(request.getTarga()!=null) {

		}
		if(request.getColore()!=null) {

		}
		if(request.getCostruttore()!=null) {

		}
		if(request.getId()!=null) {

		}
		if(request.getModello()!=null) {

		}
		if(request.getCosto()!=null) {

		}

		return autoTrovate;
	}

}
