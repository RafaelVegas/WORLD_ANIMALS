package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

	//@Query("SELECT ANI FROM ANIMAL ANI JOIN ESPECIE ESP ON ANI.ID_ESPECIE = ESP.ID_ESPECIE WHERE ANI.ID_ANIMAL = ?1")
	Optional<Animal> findByIdAnimal(Long idAnimal);
}
