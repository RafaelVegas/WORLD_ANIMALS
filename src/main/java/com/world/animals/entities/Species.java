package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESPECIE")
public class Species {

	@Id
	@Column(name="NOMBRE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nombre;
	
	@Column(name="CARACTERISTICA")
	private String caracteristica;
	
}
