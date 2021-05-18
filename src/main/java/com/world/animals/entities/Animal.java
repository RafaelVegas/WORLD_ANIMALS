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

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

	@JoinColumn(name = "ID_ESPECIE", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private Specie specie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "animal")
	private List<Breed> breeds;

	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinTable(name = "CONTINENTE_ANIMAL", joinColumns =  @JoinColumn(name = "ID_ANIMAL") , inverseJoinColumns = 
			@JoinColumn(name = "CONTINENTE_ID_CONTINENTE") )
	private Set<Continent> rContinent;

}