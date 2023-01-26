package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.GeoRepository;
import srl.neotech.model.Comune;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Component
public class GeoDAO {
	
	@Autowired
	GeoRepository geoRepository;
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		return geoRepository.getListaProvince(id_regione);
	}
	
	public List<Regione> getListaRegioni() {
		return geoRepository.getListaRegioni();
	}
	
	public List<Comune> getListaComuni(Integer id_provincia) {
		return geoRepository.getListaComuni(id_provincia);
	}

}
