package com.previred.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.previred.dto.PeriodoDTO;
import com.previred.service.ConsultaFechasService;


@RequestMapping("/desafio_1")
@RestController
public class ConsultaFechasController {
	
	@Autowired
	ConsultaFechasService fechasService;
	
	
	@GetMapping(value = "/fechas")	
	public PeriodoDTO consultarFechas(){	
		
		PeriodoDTO periodo = fechasService.consultarFechas();
		return periodo; 
			
	}
	
}
