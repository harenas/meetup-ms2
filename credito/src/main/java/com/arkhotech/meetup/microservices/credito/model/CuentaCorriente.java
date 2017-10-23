package com.arkhotech.meetup.microservices.credito.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuentas_ctes")
public class CuentaCorriente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Integer rut;
	
	@Column(name="cupo_total")
	private Integer cupoTotal;
	
	@Column(name="cupo_utilizado")
	private Integer cupoUtilizado;
	
	private Integer estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public Integer getCupoTotal() {
		return cupoTotal;
	}

	public void setCupoTotal(Integer cupoTotal) {
		this.cupoTotal = cupoTotal;
	}

	public Integer getCupoUtilizado() {
		return cupoUtilizado;
	}

	public void setCupoUtilizado(Integer cupoUtilizado) {
		this.cupoUtilizado = cupoUtilizado;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
