package com.world.animals.entities;

import javax.persistence.CascadeType;
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
@Table(name = "PERSONA")
public class Person {

	@Id
	@Column(name = "ID_PERSONA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerson;

	@Column(name = "SEXO")
	private String gender;

	@Column(name = "NOMBRE")
	private String nameComplete;

	@Column(name = "EDAD")
	private int age;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PAIS", nullable = false, unique = true)
	private Country country;

}
