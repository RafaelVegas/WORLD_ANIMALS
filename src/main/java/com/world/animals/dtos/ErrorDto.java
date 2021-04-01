package com.world.animals.dtos;

import java.io.Serializable;

public class ErrorDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String valor;
		
	public ErrorDto(String name, String valor) {
		super();
		this.name = name;
		this.valor = valor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
