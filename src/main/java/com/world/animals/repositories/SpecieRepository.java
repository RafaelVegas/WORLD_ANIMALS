package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Specie;

@Repository
public interface SpecieRepository extends JpaRepository<Specie, Long>{

	Optional<Specie> findByIdSpecie(Long idSpecie);
	
}
