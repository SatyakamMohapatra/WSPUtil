package com.unify_iri.wspUtill.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.unify_iri.wspUtill.dto.WspDBConnect;

@Repository
public class WspDaoImpl implements WspDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String getPROPERTIES(WspDBConnect model){
		//this.jdbcTemplate = WspUtill.getJdbcTemplate(UserName, Password);
		System.out.println("[selectAllPROPERTIES][WspDaoImpl]");
		
		return null;
		
	}

	@Override
	public void updateChartPROPERTIES(String wspIds, String paneType, String UserName, String Password ) {
		
	}

}
