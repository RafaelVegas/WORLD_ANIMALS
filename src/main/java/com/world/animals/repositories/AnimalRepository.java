package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world.animals.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long>{

	Optional<Animal> getAnimalById(Long idAnimal);
}
