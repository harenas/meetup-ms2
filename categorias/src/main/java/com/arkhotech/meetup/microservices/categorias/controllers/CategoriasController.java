package com.arkhotech.meetup.microservices.categorias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arkhotech.meetup.microservices.categorias.model.Categoria;
import com.arkhotech.meetup.microservices.categorias.repositories.CategoriasCrudRepository;

@Controller
@RequestMapping(path="/categorias")
public class CategoriasController {

	@Autowired
	CategoriasCrudRepository categoriasCrudRepository;
	
	@GetMapping(path="/")
	public @ResponseBody Iterable<Categoria> listAllCategorias() {
		return categoriasCrudRepository.findAll();
	}

}
