package srl.neotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.GeoDAO;
import srl.neotech.model.Comune;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Service
public class GeoService {
	
	@Autowired
	GeoDAO geoDAO;
	
	public List<Regione> getListaRegioni() {		
		return geoDAO.getListaRegioni();
	}
	
	public List<Provincia> getListaProvince(Integer idRegione) {
		return geoDAO.getListaProvince(idRegione);
	}

	public List<Comune> getListaComuni(Integer idProvincia) {
		return geoDAO.getListaComuni(idProvincia);
	}


}
