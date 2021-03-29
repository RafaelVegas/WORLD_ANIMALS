package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESPECIE")
public class Species {

	@Id
	@Column(name="ESPECIE_NOMBRE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String especieNombre;
	
	@Column(name="CARACTERISTICA")
	private String caracteristica;

	public String getEspecieNombre() {
		return especieNombre;
	}

	public void setEspecieNombre(String nombre) {
		this.especieNombre = nombre;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
