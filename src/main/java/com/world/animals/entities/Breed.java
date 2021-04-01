package com.world.animals.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="RAZA")
public class Breed {
	
	@Id
	@Column(name="ID_RAZA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBreed;
	
	@Column(name="RAZA_NOMBRE")
	private String breedName;
	
	@Column(name="COLOR")
	private String colour;
	
	@Column(name="CARACTERISTICA")
	private String characteristic;
	
	@Column(name="PESO_MEDIO")
	private String middleWeight;
	
	@JoinColumn(name = "ID_ANIMAL")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Animal animal;

	public Long getIdBreed() {
		return idBreed;
	}

	public void setIdBreed(Long idBreed) {
		this.idBreed = idBreed;
	}

	public String getBreedName() {
		return breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public String getMiddleWeight() {
		return middleWeight;
	}

	public void setMiddleWeight(String middleWeight) {
		this.middleWeight = middleWeight;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
