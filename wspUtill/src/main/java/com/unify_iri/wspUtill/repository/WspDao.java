package com.unify_iri.wspUtill.repository;

import com.unify_iri.wspUtill.dto.WspDBConnect;

public interface WspDao {
	
	public String getPROPERTIES(WspDBConnect model);
	public void updateChartPROPERTIES(String wspIds, String paneType, String UserName, String Password );

}
