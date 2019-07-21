package com.previred.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.previred.dto.PeriodoDTO;
import com.previred.service.ConsultaFechasService;

@Component
public class ConsultaFechasServiceImpl implements ConsultaFechasService {

    private static final Logger LOGGER = Logger.getLogger(ConsultaFechasServiceImpl.class);
    
    @Autowired
    private Environment env;  
    
    
    public PeriodoDTO consultarFechas(){
		LOGGER.info("[consultarFechas] INICIO de metodo.");		
		
		RestTemplate restTemplate = new RestTemplate();
		PeriodoDTO periodos = restTemplate.getForObject(env.getProperty("url.GDD"), PeriodoDTO.class);
				
		List<LocalDate> periodosFaltantes = new ArrayList<LocalDate>();
		LocalDate fechaAux = periodos.getFechaCreacion();
		
		
		while (fechaAux.isBefore(periodos.getFechaFin().plusMonths(1))) {
			periodosFaltantes.add(fechaAux);		
			fechaAux = fechaAux.plusMonths(1);
		}
		
		periodosFaltantes.removeAll(periodos.getFechas());		
		periodos.setFechasFaltantes(periodosFaltantes);		
		
		LOGGER.info("[consultarFechas] FIN de metodo.");		
		return periodos;
				
	}
    
}
