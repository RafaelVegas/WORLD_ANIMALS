package com.world.animals.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ESPECIE")
public class Specie {

	@Id
	@Column(name = "ID_ESPECIE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSpecie;

	@Column(name = "ESPECIE_NOMBRE")
	private String nameSpecie;

	@Column(name = "CARACTERISTICA")
	private String characteristic;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "specie")
	private List<Animal> animal;

	public Long getIdSpecie() {
		return idSpecie;
	}

	public void setIdSpecie(Long idSpecie) {
		this.idSpecie = idSpecie;
	}

	public String getNameSpecie() {
		return nameSpecie;
	}

	public void setNameSpecie(String nameSpecie) {
		this.nameSpecie = nameSpecie;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}

}
