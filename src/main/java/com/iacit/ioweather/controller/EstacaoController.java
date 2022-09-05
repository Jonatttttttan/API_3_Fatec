package com.iacit.ioweather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/principal")
public class EstacaoController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView paginaInicial() {
		ModelAndView mv=new ModelAndView("index");
		System.out.println("Testando inicio");
		return mv;
		
	}
	
	

}
