package com.arkhotech.meetup.microservices.credito.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arkhotech.meetup.microservices.credito.model.CuentaCorriente;
import com.arkhotech.meetup.microservices.credito.repository.CuentaCorrienteJpaRepository;

@Controller
@RequestMapping(path="/ctacte")
public class CuentaCorrienteController {

	@Autowired
	CuentaCorrienteJpaRepository cuentaCorrienteJpaRepository;
	
	@GetMapping(path="/{rutCliente}")
	public @ResponseBody CuentaCorriente getCtaCte(@PathVariable Integer rutCliente) {
		return cuentaCorrienteJpaRepository.findByRut(rutCliente);
	}

}
