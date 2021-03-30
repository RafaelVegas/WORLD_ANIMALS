package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Breed;

@Repository
public interface BreedRepository extends JpaRepository<Breed, Long> {

	Optional<Breed> findByIdBreed(Long id);
}
