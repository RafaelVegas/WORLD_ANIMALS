package com.world.animals.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

	Optional<Continent> findByIdContinent(Long idContinent);	
	
	@Query("SELECT CONT FROM Continent CONT")
	public List<Continent> findAllContinent();
}
