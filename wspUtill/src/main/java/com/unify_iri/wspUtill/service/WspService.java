package com.unify_iri.wspUtill.service;

import com.unify_iri.wspUtill.dto.WspDBConnect;

public interface WspService {
	
	public String getPROPERTIES(WspDBConnect model);
	public void updateChartPROPERTIES(String wspIds, String paneType, String UserName, String Password );


}
