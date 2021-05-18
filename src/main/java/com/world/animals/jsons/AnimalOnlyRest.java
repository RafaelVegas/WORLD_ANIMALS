package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalOnlyRest {

	@JsonProperty("nombre animal")
	private String nombre;
	
	@JsonProperty("propiedad")
	private String propiedad; 
}
