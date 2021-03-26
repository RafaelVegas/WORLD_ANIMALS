package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RAZA")
public class Raza {
	
	@Id
	@Column(name="IDRAZA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRaza;
	
	@Column
	private String nombre;
	
	private String color;
	
	private String caracteristica;
	
	private String peso;	
	
}
