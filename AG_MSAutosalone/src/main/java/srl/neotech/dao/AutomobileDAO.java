package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.AutomobileRepository;
import srl.neotech.model.Automobile;

@Component
public class AutomobileDAO {

	@Autowired
	AutomobileRepository automobileRepository;
	
	public Integer countAutomobili() {
		return automobileRepository.countAutomobili();
	}
	
	public Automobile getAutomobile(Integer id) {
		return automobileRepository.getAutomobile(id);
	}
	
	public List<Automobile> getListaAutomobili(){
		return automobileRepository.getListaAutomobili();
	}
	
	public void addAutomobile(Automobile automobile) {
		automobileRepository.addAutomobile(automobile);
	}
	
	public void updateAutomobile(Automobile automobile) {
		automobileRepository.updateAutomobile(automobile);
	}
	
	public void deleteAutomobile(Integer idautomobile) {
		automobileRepository.deleteAutomobile(idautomobile);
	}
	
	
	
	
}
