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
	@Column(name="ID_ESPECIE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEspecie;
	
	@Column(name="ESPECIE_NOMBRE")
	private String especie_nombre;
	
	@Column(name="CARACTERISTICA")
	private String caracteristica;


	public Long getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(Long idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getEspecie_Nombre() {
		return especie_nombre;
	}

	public void setEspecie_Nombre(String nombre) {
		this.especie_nombre = nombre;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
