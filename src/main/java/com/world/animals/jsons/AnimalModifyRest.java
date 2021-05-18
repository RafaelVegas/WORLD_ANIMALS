package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalModifyRest {
	
	@JsonProperty("id del animal")
	private Long idAnimal;
	
	@JsonProperty("nombre")
	private String nombre;

	@JsonProperty("propiedad")
	private String propiedad;

	@JsonProperty("domestico")
	private boolean domestico;

	@JsonProperty("vida media")
	private Long vidaMedia;

	@JsonProperty("id especie")
	private Long idSpecie;
	
	public String getNombre() {
		return nombre;
	}
}
