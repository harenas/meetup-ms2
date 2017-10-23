package com.arkhotech.meetup.microservices.categorias.repositories;

import org.springframework.data.repository.CrudRepository;

import com.arkhotech.meetup.microservices.categorias.model.Categoria;

public interface CategoriasCrudRepository extends CrudRepository<Categoria, Integer> {

}
