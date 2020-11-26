package com.unab.desarrollo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.unab.desarrollo.springdata.entidad.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
