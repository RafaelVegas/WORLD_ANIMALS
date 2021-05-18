package com.world.animals.services;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalModifyRest;
import com.world.animals.jsons.AnimalAllRest;
import com.world.animals.jsons.AnimalSpecieBreedRest;
import com.world.animals.jsons.CreateAnimalRest;

public interface AnimalService {

	AnimalAllRest getAnimalById(Long id_animal) throws WorldAnimalException;
	
	AnimalSpecieBreedRest getAnimalSpecieByIdAnimal(Long id) throws WorldAnimalException;
	
	String createOneAnimal(CreateAnimalRest animalRest) throws WorldAnimalException;

	String deleteAnimal(String deleteAnimalRest) throws WorldAnimalException;
	
	String modifyAnimal(AnimalModifyRest modifyAnimal) throws WorldAnimalException;
}
