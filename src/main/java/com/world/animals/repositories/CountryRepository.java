package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world.animals.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

	Optional<Country> findByIdCountry(Long idCountry);
}
