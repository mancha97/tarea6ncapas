package com.uca.capas.ejercicio6.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.uca.capas.ejercicio6.domain.Contribuyente;

public interface ContribuyenteService {
	
	public List<Contribuyente> findAll() throws DataAccessException;
	
	public void save(Contribuyente contribuyente) throws DataAccessException;
}
