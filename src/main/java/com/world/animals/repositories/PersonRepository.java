package com.world.animals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world.animals.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Optional<Person> findByIdPerson(Long idPerson);
}
