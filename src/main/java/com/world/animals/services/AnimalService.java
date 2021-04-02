package com.world.animals.services;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalRest;
import com.world.animals.jsons.AnimalSpecieBreedRest;
import com.world.animals.jsons.CreateAnimalRest;

public interface AnimalService {

	AnimalRest getAnimalById(Long id_animal) throws WorldAnimalException;
	
	AnimalSpecieBreedRest getAnimalSpecieByIdAnimal(Long id) throws WorldAnimalException;
	
	String createOneAnimal(CreateAnimalRest animalRest) throws WorldAnimalException;
}
