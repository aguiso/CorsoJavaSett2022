package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import srl.neotech.dao.AutomobileDAO;
import srl.neotech.model.Automobile;
import srl.neotech.requestresponse.RequestAddAutomobile;

@Service
public class AutomobileService {
	
		@Autowired
		AutomobileDAO automobileDAO;
		
		public Integer countAutomobili() {
			return automobileDAO.countAutomobili();
		}
		
		public Automobile getAutomobile(Integer id) {
			return automobileDAO.getAutomobile(id);
		}
		
		public ArrayList<Automobile> getListaAutomobili(){
			List<Automobile> listaAutomobili_= automobileDAO.getListaAutomobili();
			ArrayList<Automobile> listaAutomobili=new ArrayList<Automobile>();
			listaAutomobili.addAll(listaAutomobili_);
			return listaAutomobili;
		}
		
		@Transactional
		public void addAutomobile(RequestAddAutomobile dati) {
			Automobile automobile=new Automobile(dati.getId(), dati.getDescrizione());
			automobileDAO.addAutomobile(automobile);
		}
		
		@Transactional
		public void deleteAutomobile(Integer idAutomobile) {
			automobileDAO.deleteAutomobile(idAutomobile);
		}

}
