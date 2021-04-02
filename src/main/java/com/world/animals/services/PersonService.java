package com.world.animals.services;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.PersonRest;

public interface PersonService {

	PersonRest getPersonById(Long idPerson) throws WorldAnimalException;
}
