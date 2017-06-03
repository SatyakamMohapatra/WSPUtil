package com.unify_iri.wspUtill.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class MainControler {
	
	@RequestMapping(path = "/",method=RequestMethod.GET)
	public ModelAndView redirectToMainPage(){
		ModelAndView modelAndView  = new ModelAndView("index");
		 return modelAndView;
	 }

}
