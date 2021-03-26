package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="RAZA")
public class Breed {
	
	@Id
	@Column(name="IDRAZA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRaza;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="CARACTERISTICA")
	private String caracteristica;
	
	@Column(name="PESO")
	private String peso;	
	
}
