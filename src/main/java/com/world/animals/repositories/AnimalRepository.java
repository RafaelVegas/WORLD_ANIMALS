package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

	Optional<Animal> getAnimalById(Long idAnimal);
}
