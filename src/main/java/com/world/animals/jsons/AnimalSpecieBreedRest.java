package com.world.animals.jsons;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalSpecieBreedRest {

	@JsonProperty("animal")
	private AnimalAllRest Animal;

	@JsonProperty("especie")
	private SpeciesRest specie;

	@JsonProperty("raza animal")
	private List<BreedRest> breeds;

	public AnimalAllRest getAnimal() {
		return Animal;
	}

	public void setAnimal(AnimalAllRest animal) {
		Animal = animal;
	}

	public SpeciesRest getSpecie() {
		return specie;
	}

	public void setSpecie(SpeciesRest specie) {
		this.specie = specie;
	}

	public List<BreedRest> getBreeds() {
		return breeds;
	}

	public void setBreeds(List<BreedRest> breeds) {
		this.breeds = breeds;
	}

}
