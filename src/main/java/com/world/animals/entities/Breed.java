package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RAZA")
public class Breed {
	
	@Id
	@Column(name="IDRAZA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRaza;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="CARACTERISTICA")
	private String caracteristica;
	
	@Column(name="PESO")
	private String peso;

	public Long getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(Long idRaza) {
		this.idRaza = idRaza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}	
	
}
