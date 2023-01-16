package srl.neotech.dao.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import srl.neotech.model.Automobile;

@Repository
public class AutomobileRepository {

	
	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	
	@Autowired 
	private PlatformTransactionManager transactionManager;
	
	
	public Integer countAutomobili() {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		
		//Query
		String query="select count(*) from automobile";
		Integer numAutomobili=jdbcTemplate.queryForObject(query,params,Integer.class);
		return numAutomobili;
	}
	
	
	public Automobile getAutomobile(Integer id) {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("idAutomobile", id);
		//Query
		String query="select * from automobile where id = :idAutomobile";
		Automobile automobile=jdbcTemplate.queryForObject(
				query,
                params,
                (rs, rowNum) ->new Automobile(rs.getInt("id"), rs.getString("descrizione"))
        );
		return automobile;
	}
	
	
	public List<Automobile> getListaAutomobili(){
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		//Query
		String query="select * from automobile";
		
		List<Automobile> automobili=jdbcTemplate.query(
				query,
                params,
                (rs, rowNum) ->new Automobile(rs.getInt("id"), rs.getString("descrizione"))
        );
		return automobili;
	}
	
	
	public void addAutomobile(Automobile automobile) {
		//configurazione TX
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("idAutomobile", automobile.getId());
		params.addValue("descrAutomobile", 	automobile.getDescrizione());
				
		//Query
		String query="insert into Automobile(id, descrizione) VALUES (:idAutomobile, :descrAutomobile)";
		try {
			jdbcTemplate.update(query,params);
			transactionManager.commit(transactionStatus);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		}
	}
	
	
	public void updateAutomobile (Automobile automobile) {
		//configurazione TX
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
	    
	  //Parametri da passsare alla query
	  MapSqlParameterSource params=new MapSqlParameterSource();
	  params.addValue("idAutomobile", automobile.getId());
	  params.addValue("descrAutomobile", automobile.getDescrizione());
	  
	  //Query
	  String query="update Automobile set descrizione=:descAutomobile where id=:idAutomobile";
	  
	  try {
		jdbcTemplate.update(query,params);
		transactionManager.commit(transactionStatus);
	} catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		transactionManager.rollback(transactionStatus);
	}
	}
	
	public void deleteAutomobile(Integer idAutomobile) {
		//configurazione TX
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
	    
	  //Parametri da passsare alla query
	  MapSqlParameterSource params=new MapSqlParameterSource();
	  params.addValue("idAutomobile", idAutomobile);
	 
	  //Query
	  String query="delete Automobile where id=:idAutomobile";
	 
	  try {
		jdbcTemplate.update(query,params);
		transactionManager.commit(transactionStatus);
	} catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		transactionManager.rollback(transactionStatus);
	}
	  
	  
	}
}
