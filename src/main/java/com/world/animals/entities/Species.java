package com.world.animals.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ESPECIE")
public class Species {

	@Id
	@Column(name="ID_ESPECIE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEspecie;
	
	@Column(name="ESPECIE_NOMBRE")
	private String especieNombre;
	
	@Column(name="CARACTERISTICA")
	private String caracteristica;

	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "specie")
	private List<Animal> animal;
	
	public void setIdEspecie(Long idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getEspecieNombre() {
		return especieNombre;
	}

	public void setEspecieNombre(String especieNombre) {
		this.especieNombre = especieNombre;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}
	
	
}
