package com.unify_iri.wspUtill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unify_iri.wspUtill.dto.WspDBConnect;
import com.unify_iri.wspUtill.repository.WspDao;

@Service
public class WspServiceImpl implements WspService {
	
	@Autowired
	private WspDao wspDao;
	
	@Override
	public String getPROPERTIES(WspDBConnect model) {
		System.out.println("[selectAllPROPERTIES][Service call]");
		wspDao.getPROPERTIES(model);
		
		return null;
	}

	@Override
	public void updateChartPROPERTIES(String wspIds, String paneType, String UserName, String Password) {
		
	}

}
