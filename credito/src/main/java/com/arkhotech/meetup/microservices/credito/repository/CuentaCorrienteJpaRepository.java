package com.arkhotech.meetup.microservices.credito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arkhotech.meetup.microservices.credito.model.CuentaCorriente;

public interface CuentaCorrienteJpaRepository extends JpaRepository<CuentaCorriente, Integer> {

	@Query("select c from CuentaCorriente c where rut = ?1")
	CuentaCorriente findByRut(Integer rutCliente);
}
