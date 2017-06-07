package com.unify_iri.wspUtill.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unify_iri.wspUtill.dto.WspDBConnect;
import com.unify_iri.wspUtill.service.WspService;
import com.unify_iri.wspUtill.utilityPkg.PANE_TYPE;

@Controller
public class MainControler {
	
	@Autowired
	private WspService wspService;
	
	@ModelAttribute("planTypes")
	public List getPlanTypes(){
		List<String> planTypes = new ArrayList<String>();
		for (PANE_TYPE type : PANE_TYPE.values()) {
			planTypes.add(type.name());
		}
		return planTypes;
	}
	
	@RequestMapping(path = "/",method=RequestMethod.GET)
	public ModelAndView redirectToMainPage(){

		System.out.println("[com.unify_iri.wspUtill.controler.MainControler]"
				+ "[redirectToMainPage][ Main Page Loaded]");
		wspService.selectAllPROPERTIES("", "", null, null);
		
		return new ModelAndView("profile","wspModel",new WspDBConnect());
	}

	@RequestMapping(path = "/search",method= RequestMethod.POST)
	public String DBConnection(@ModelAttribute("wspDBConnect") WspDBConnect model){
		WspDBConnect connect= new WspDBConnect(model.getUrl(),model.getUserName(),model.getPassword());
		
		
		return "connected";
	}
}
