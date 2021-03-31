package com.world.animals.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Country {

	@Id
	@Column(name = "ID_PAIS")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCountry;

	@Column(name = "NOMBRE")
	private String nameCountry;

	@Column(name = "NUM_HAB")
	private Long numberInhabitants;

	@Column(name = "CAPITAL")
	private String capital;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CONTINENTE", nullable = false, unique = true)
	private Continent continent;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "country")
	private List<Person> persons;

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public Long getNumberInhabitants() {
		return numberInhabitants;
	}

	public void setNumberInhabitants(Long numberInhabitants) {
		this.numberInhabitants = numberInhabitants;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
