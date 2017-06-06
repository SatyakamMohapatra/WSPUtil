package com.unify_iri.wspUtill.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unify_iri.wspUtill.dto.WspDBConnect;

@Controller
public class MainControler {
	
	@RequestMapping(path = "/",method=RequestMethod.GET)
	public ModelAndView redirectToMainPage(){

		System.out.println("[com.unify_iri.wspUtill.controler.MainControler]"
				+ "[redirectToMainPage][ Main Page Loaded]");
		
		return new ModelAndView("index","wspModel",new WspDBConnect());
	}

	@RequestMapping(path = "/connect",method= RequestMethod.POST)
	public String DBConnection(@ModelAttribute("wspDBConnect") WspDBConnect model){
		
		WspDBConnect connect= new WspDBConnect(model.getUrl(),model.getUserName(),model.getPassword());
		
		return "connected";
	}
}
