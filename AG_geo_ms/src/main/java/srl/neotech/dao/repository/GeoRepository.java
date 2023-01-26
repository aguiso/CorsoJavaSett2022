package srl.neotech.dao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import srl.neotech.model.Comune;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Repository
public class GeoRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public List<Provincia> getListaProvince(Integer idRegione) {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		List<Provincia> province=new ArrayList<Provincia>();
		params.addValue("idRegione", idRegione);
		//Query
		String query="select sigla.provincia from provincia where id_regione=idRegione order by provincia";
		province=jdbcTemplate.query(
				query,
				params,
				(rs, rowNum) ->new Provincia(rs.getString("sigla"),rs.getString("provincia"))
		);
				return province;
	}
	
	public List<Regione> getListaRegioni(){
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		//Query
		String query="select * from regione";
		
		List<Regione> elementi=jdbcTemplate.query(
				query,
                params,
                (rs, rowNum) ->new Regione(rs.getInt("id_regione"), rs.getString("regione"))
        );
		return elementi;
	}
	
	public List<Comune> getListaComuni(Integer idProvincia) {
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		List<Comune> comuni=new ArrayList<Comune>();
		params.addValue("idProvincia", idProvincia);
		//Query
		String query="select istat.comune from comune where sigla=:idProvincia order by comune";
		comuni=jdbcTemplate.query(
				query,
				params,
				(rs, rowNum) ->new Comune(rs.getInt("istat"),rs.getString("comune"))
		);
				return comuni;
	}
}
