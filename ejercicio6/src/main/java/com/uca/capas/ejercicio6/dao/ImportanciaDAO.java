package com.uca.capas.ejercicio6.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.uca.capas.ejercicio6.domain.Importancia;

public interface ImportanciaDAO {
	
	public List<Importancia> findAll() throws DataAccessException;

	public Importancia findOne(Integer code) throws DataAccessException;

}
