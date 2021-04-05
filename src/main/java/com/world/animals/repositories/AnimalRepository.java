package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

	// SEARCH ANIMAL FOR ID
	Optional<Animal> findByIdAnimal(Long idAnimal);

	// SEARCH ONE ANIMAL, SPECIE AND BREEDS EN BBDD
	@Query("SELECT ANI FROM Animal ANI WHERE ID_ANIMAL = ?1")
	public Optional<Animal> getAnimalSpecieBreeds(Long idAnimal);

	//SEARCH ANIMAL BY NAME
	public Animal findByNombre(String nameAnimal);
}
