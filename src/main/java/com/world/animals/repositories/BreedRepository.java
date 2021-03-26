package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world.animals.entities.Breed;

public interface BreedRepository extends JpaRepository<Breed, Long> {

	Optional<Breed> getBreedById(Long id);
}
