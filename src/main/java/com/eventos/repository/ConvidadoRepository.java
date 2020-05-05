package com.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.model.Convidado;
import com.eventos.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado,String> {
	
	Iterable<Convidado> findByEvento(Evento evento);

}
