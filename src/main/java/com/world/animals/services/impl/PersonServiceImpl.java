package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Person;
import com.world.animals.jsons.OnePersonRest;
import com.world.animals.repositories.PersonRepository;
import com.world.animals.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepository personRepository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public OnePersonRest getPersonById(Long idPerson) {
		return modelmapper.map(getPersonForMapeo(idPerson), OnePersonRest.class);
	}

	private Person getPersonForMapeo(Long idPerson) {
		return personRepository.findByIdPerson(idPerson).orElseThrow();
	}

}
