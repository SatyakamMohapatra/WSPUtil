package com.unify_iri.wspUtill.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainControler {
	
	@RequestMapping(path = "/",method=RequestMethod.GET)
	public ModelAndView redirectToMainPage(){
		ModelAndView modelAndView  = new ModelAndView("index");
		System.out.println("[com.unify_iri.wspUtill.controler.MainControler]"
				+ "[redirectToMainPage][ Main Page Loaded]");
		 return modelAndView;
	 }

}
