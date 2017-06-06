package com.unify_iri.wspUtill.repository;

public interface WspDao {
	
	public void selectAllPROPERTIES(String wspIds, String paneType, String UserName, String Password );
	public void updateChartPROPERTIES(String wspIds, String paneType, String UserName, String Password );

}
