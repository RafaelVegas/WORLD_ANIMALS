package com.world.animals.jsons;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalSpecieRest {

	@JsonProperty("animal")
	private AnimalRest Animal;

	@JsonProperty("especie")
	private SpeciesRest specie;

	@JsonProperty("raza animal")
	private List<OneBreedRest> breeds;

	public AnimalRest getAnimal() {
		return Animal;
	}

	public void setAnimal(AnimalRest animal) {
		Animal = animal;
	}

	public SpeciesRest getSpecie() {
		return specie;
	}

	public void setSpecie(SpeciesRest specie) {
		this.specie = specie;
	}

	public List<OneBreedRest> getBreeds() {
		return breeds;
	}

	public void setBreeds(List<OneBreedRest> breeds) {
		this.breeds = breeds;
	}

}
