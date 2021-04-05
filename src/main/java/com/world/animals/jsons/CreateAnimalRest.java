package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAnimalRest {

	@JsonProperty("nombre especie")
	private String specie;

	@JsonProperty("nombre animal")
	private String nombre;

	@JsonProperty("propiedad")
	private String propiedad;

	@JsonProperty("domestico")
	private boolean domestico;

	@JsonProperty("vida media")
	private Long vidaMedia;

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
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
}
