package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Species;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer>{

	Optional<Species> findByIdEspecie(Integer especie_nombre);
	
}
