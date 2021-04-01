package com.world.animals.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalRest {
	@JsonProperty("nombre")
	private String nombre;

	@JsonProperty("propiedad")
	private String propiedad;

	@JsonProperty("domestico")
	private boolean domestico;

	@JsonProperty("vida media")
	private Long vidaMedia;

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
