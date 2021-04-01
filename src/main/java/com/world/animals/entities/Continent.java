package com.world.animals.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CONTINENTE")
public class Continent {

	@Id
	@Column(name = "ID_CONTINENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContinent;

	@Column(name = "NOMBRE")
	private String name;

	@Column(name = "ZONA")
	private String zone;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "continent")
	private List<Country> countries;

	public Long getIdContinent() {
		return idContinent;
	}

	public void setIdContinent(Long idContinent) {
		this.idContinent = idContinent;
	}

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

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

}
