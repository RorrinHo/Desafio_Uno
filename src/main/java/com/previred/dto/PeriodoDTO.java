package com.previred.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;



public class PeriodoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private int id;  
    private LocalDate fechaCreacion;  
    private LocalDate fechaFin;    
    private List<LocalDate> fechas;
    private List<LocalDate> fechasFaltantes;

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<LocalDate> getFechas() {
		return fechas;
	}

	public void setFechas(List<LocalDate> fechas) {
		this.fechas = fechas;
	}

	public List<LocalDate> getFechasFaltantes() {
		return fechasFaltantes;
	}

	public void setFechasFaltantes(List<LocalDate> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}
	
}