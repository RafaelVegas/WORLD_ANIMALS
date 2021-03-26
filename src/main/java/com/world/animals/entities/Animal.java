package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANIMAL")
public class Animal {

	@Id
	@Column(name="IDANIMAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="PROPIEDAD")
	private String propiedad;
	
	@Column(name="DOMESTICO")
	private boolean domestico;
	
	@Column(name="VIDA_MEDIA")
	private String vidaMedia;

	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	public String getVidaMedia() {
		return vidaMedia;
	}

	public void setVidaMedia(String vidaMedia) {
		this.vidaMedia = vidaMedia;
	}
	
	
}
