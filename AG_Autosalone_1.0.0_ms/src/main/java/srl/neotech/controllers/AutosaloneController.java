package srl.neotech.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Automobile;
import srl.neotech.requestresponse.GetAutomobileResponse;
import srl.neotech.requestresponse.GetListaAutomobiliResponse;
import srl.neotech.requestresponse.RequestAddAutomobile;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.AutomobileService;

@RestController
public class AutosaloneController {

	@Autowired
	AutomobileService automobileService;

	@ResponseBody
	@GetMapping(value = "/getCountAutomobili", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getCountAutomobili() {
		// inizializzo la response
		ResponseBase response = new ResponseBase();
		try {
			// chiamo il service
			int numAutomobili = automobileService.countAutomobili();

			// preparo la response
			response.setSimpleData(numAutomobili);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}

	@ResponseBody
	@GetMapping(value = "/getAutomobile/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public GetAutomobileResponse getAutomobile(@PathVariable("id") Integer idAutomobile) {
		// inizializzo la response
		GetAutomobileResponse response = new GetAutomobileResponse();
		try {
			// chiamo il service
			Automobile automobile = automobileService.getAutomobile(idAutomobile);

			// preparo la response
			response.setElemento(automobile);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}

	@ResponseBody
	@GetMapping(value = "/getListaAutomobili", produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaAutomobiliResponse getListaAutomobili() {
		// inizializzo la response
		GetListaAutomobiliResponse response = new GetListaAutomobiliResponse();
		try {
			// chiamo il service
			ArrayList<Automobile> listaAutomobili = automobileService.getListaAutomobili();

			// preparo la response
			response.setElementi(listaAutomobili);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}

	@ResponseBody
	@PutMapping(value = "/addAutomobile", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addAutomobile(@RequestBody RequestAddAutomobile dati) {
		// inizializzo la response
		ResponseBase response = new ResponseBase();
		try {
			// chiamo il service
			automobileService.addAutomobile(dati);

			// rispondo
			response.setCode("OK");
		} catch (Exception ex) {
			response.setCode("KO");
		}
		return response;
	}

	@ResponseBody
	@DeleteMapping(value = "/delAutomobile/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase delAutomobile(@PathVariable("id") Integer idAutomobile) {
		// inizializzo la response
		ResponseBase response = new ResponseBase();
		try {
			// chiamo il service
			automobileService.deleteAutomobile(idAutomobile);

			// rispondo
			response.setCode("OK");
		} catch (Exception ex) {
			response.setCode("KO");
		}
		return response;
	}
}
