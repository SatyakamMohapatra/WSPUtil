package com.unify_iri.wspUtill.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.unify_iri.wspUtill.utilityPkg.WspUtill;

@Repository
public class WspDaoImpl implements WspDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void selectAllPROPERTIES(String wspIds, String paneType, String UserName, String Password ) {
		//this.jdbcTemplate = WspUtill.getJdbcTemplate(UserName, Password);
		System.out.println("[selectAllPROPERTIES][WspDaoImpl]");
		
	}

	@Override
	public void updateChartPROPERTIES(String wspIds, String paneType, String UserName, String Password ) {
		
	}

}
