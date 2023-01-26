package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Comune;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;
import srl.neotech.requestresponse.GetListaComuniResponse;
import srl.neotech.requestresponse.GetListaRegioniResponse;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.GeoService;

@RestController
public class GeoApiController {

	@Autowired
	GeoService geoService;

	@ResponseBody
	@GetMapping(value = "/getListaRegioni", produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaRegioniResponse getListaRegioni() {
		// inizializzo la response
		GetListaRegioniResponse response = new GetListaRegioniResponse();
		try {
			// chiamo il service
			List<Regione> listaRegioni = geoService.getListaRegioni();

			// preparo la response
			response.setRegioni(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;

	}

	@ResponseBody
	@GetMapping(value = "/getlistaProvince", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getListaProvince(@RequestParam("id_regione") Integer idRegione) {
		// inizializzo la response
		ResponseBase response = new ResponseBase();
		try {
			List<Provincia> province = geoService.getListaProvince(idRegione);
			response.setSimpleData(province);
			response.setCode("OK");
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}

	@ResponseBody
	@GetMapping(value = "/getListaComuni", produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaComuniResponse getListaComuni(@RequestParam("id_provincia") Integer idProvincia) {
		// inizializzo la response
		GetListaComuniResponse response = new GetListaComuniResponse();
		try {
			// chiamo il service
			List<Comune> listaComune = geoService.getListaComuni(idProvincia);

			// preparo la response
			response.setComuni(listaComune);
			response.setCode("OK");
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;

	}
}
