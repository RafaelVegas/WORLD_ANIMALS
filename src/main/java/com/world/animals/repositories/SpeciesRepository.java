package com.world.animals.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.world.animals.entities.Species;

public interface SpeciesRepository extends JpaRepository<Species, String>{

	Optional<Species> getSpeciesByName(String nameSpecies);
	
	@Query("SELECT SPEC FROM ESPECIE SPEC")
	public List<Species> getAllSpecies();
}
