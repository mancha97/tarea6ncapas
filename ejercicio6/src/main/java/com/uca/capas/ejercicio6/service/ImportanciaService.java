package com.uca.capas.ejercicio6.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.uca.capas.ejercicio6.domain.Importancia;

public interface ImportanciaService {
	
	public List<Importancia> findAll() throws DataAccessException;
	
	public Importancia findOne(Integer c_importancia) throws DataAccessException;

}
