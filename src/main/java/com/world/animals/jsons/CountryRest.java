package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryRest {

	@JsonProperty("pais")
	private String nameCountry;

	@JsonProperty("num habitantes")
	private String numberInhabitants;

	@JsonProperty("capital")
	private String capital;

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public String getNumberInhabitants() {
		return numberInhabitants;
	}

	public void setNumberInhabitants(String numberInhabitants) {
		this.numberInhabitants = numberInhabitants;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
