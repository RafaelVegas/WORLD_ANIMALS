package com.world.animals.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="RAZA")
public class Breed implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_RAZA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBreed;
	
	@Column(name="NOMBRE")
	private String breedName;
	
	@Column(name="COLOR")
	private String colour;
	
	@Column(name="CARACTERISTICA")
	private String characteristic;
	
	@Column(name="PESO_MEDIO")
	private String middleWeight;
	
	@JoinColumn(name = "ID_ANIMAL")
	@ManyToOne(fetch = FetchType.EAGER)
	private Animal animal;

}
