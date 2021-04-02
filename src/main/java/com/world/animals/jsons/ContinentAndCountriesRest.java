package com.world.animals.jsons;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContinentAndCountriesRest {

	@JsonProperty("nombre")
	private String name;

	@JsonProperty("localización")
	private String zone;

	@JsonProperty("países")
	private List<CountryRest> countries;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public List<CountryRest> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryRest> countries) {
		this.countries = countries;
	}

}
