package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalBreedRest {

	@JsonProperty("animal")
	private AnimalOnlyRest animal;
	
	@JsonProperty("raza")
	private String breedName;
	
	@JsonProperty("caracteristicas")
	private String characteristic;
}
