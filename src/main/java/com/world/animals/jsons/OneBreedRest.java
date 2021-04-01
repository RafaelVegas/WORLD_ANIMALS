package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OneBreedRest {

	@JsonProperty("id")
	private Long idBreed;
	
	@JsonProperty("nombre")
	private String nameBreed;
	
	@JsonProperty("color")
	private String colour;
	
	@JsonProperty("caracteristica")
	private String characteristic;
	
	@JsonProperty("peso medio")
	private String middleWeight;

	public Long getIdBreed() {
		return idBreed;
	}

	public void setIdBreed(Long idBreed) {
		this.idBreed = idBreed;
	}

	public String getNameBreed() {
		return nameBreed;
	}

	public void setNameBreed(String nameBreed) {
		this.nameBreed = nameBreed;
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

	
}
