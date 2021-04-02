package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Person;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.PersonRest;
import com.world.animals.repositories.PersonRepository;
import com.world.animals.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;

	public static final ModelMapper modelmapper = new ModelMapper();

	@Override
	public PersonRest getPersonById(Long idPerson) throws WorldAnimalException {
		return modelmapper.map(getPersonForMapeo(idPerson), PersonRest.class);
	}

	private Person getPersonForMapeo(Long idPerson) throws WorldAnimalException {
		return personRepository.findByIdPerson(idPerson)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Persona no encontrada con ID: " + idPerson));
	}

}
