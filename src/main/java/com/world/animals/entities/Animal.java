package com.world.animals.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMAL")
public class Animal {

	@Id
	@Column(name = "ID_ANIMAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "PROPIEDAD")
	private String propiedad;

	@Column(name = "DOMESTICO")
	private boolean domestico;

	@Column(name = "VIDA_MEDIA")
	private Long vidaMedia;

	@JoinColumn(name = "ID_ESPECIE", nullable = false, unique = true)
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Species specie;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "animal")
	private List<Breed> breeds;

	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinTable(name = "CONTINENTE_ANIMAL", joinColumns = { @JoinColumn(name = "ID_ANIMAL") }, inverseJoinColumns = {
			@JoinColumn(name = "CONTINENTE_ID_CONTINENTE") })
	private Set<Continent> rContinent;

	public List<Breed> getBreeds() {
		return breeds;
	}

	public void setBreed(List<Breed> breeds) {
		this.breeds = breeds;
	}

	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	public Long getVidaMedia() {
		return vidaMedia;
	}

	public void setVidaMedia(Long vidaMedia) {
		this.vidaMedia = vidaMedia;
	}

	public Species getSpecie() {
		return specie;
	}

	public void setSpecie(Species specie) {
		this.specie = specie;
	}

	public Set<Continent> getrContinent() {
		return rContinent;
	}

	public void setrContinent(Set<Continent> rContinent) {
		this.rContinent = rContinent;
	}

	public void setBreeds(List<Breed> breeds) {
		this.breeds = breeds;
	}

}
