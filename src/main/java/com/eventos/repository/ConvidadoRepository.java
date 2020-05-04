package com.eventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado,String> {

}
