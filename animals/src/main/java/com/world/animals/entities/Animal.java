package com.world.animals.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANIMAL")
public class Animal {

	@Id
	@Column(name="IDANIMAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="PROPIEDAD")
	private String propiedad;
	
	@Column(name="DOMESTICO")
	private boolean domestico;
	
	@Column(name="VIDA_MEDIA")
	private String vidaMedia;
	
}
