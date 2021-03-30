package com.world.animals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

	Continent findByIdContinent(Long idContinent) ;
}
