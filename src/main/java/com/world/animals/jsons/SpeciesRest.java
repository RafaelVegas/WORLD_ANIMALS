package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpeciesRest {

	@JsonProperty("especie_nombre")
	private String nameSpecie;

	@JsonProperty("caracteristica")
	private String characteristic;

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

}
