package com.world.animals.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.world.animals.entities.Breed;

@Repository
public interface BreedRepository extends JpaRepository<Breed, Long> {

	Optional<Breed> findByIdBreed(Long id);
	
	@Query(value = "SELECT BR FROM Breed BR ")
	@Transactional(readOnly = true)
	public List<Breed> findBreed();
	
	@Query(value = "{call lista_procedure()}", nativeQuery = true)
	List<Breed> listaProcedure();
	
/*	//se le pone IN para decir que es un parametro de entrada
	@Query(value = "{call raza_animal(:idBreedIn)}", nativeQuery = true)
	Optional<Breed> isDtoAnimalBreed(@Param("idBreedIn") Long idBreedIN);*/
}
