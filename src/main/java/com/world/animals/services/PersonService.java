package com.world.animals.services;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.OnePersonRest;

public interface PersonService {

	OnePersonRest getPersonById(Long idPerson) throws WorldAnimalException;
}