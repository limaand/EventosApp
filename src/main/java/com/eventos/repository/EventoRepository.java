package com.eventos.repository;

import org.springframework.data.repository.CrudRepository;
import com.eventos.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	
	Evento findByCodigo(long codigo);
		
	

}
