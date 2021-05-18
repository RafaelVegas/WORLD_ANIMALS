package com.world.animals.services;

import java.util.List;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalBreedRest;
import com.world.animals.jsons.BreedRest;

public interface BreedService{

	BreedRest getOneBreedById(long idBreed) throws WorldAnimalException;
	
	List<BreedRest> getAllBreed() throws WorldAnimalException; 
	
	AnimalBreedRest getBreedAndnimal(Long idAnimal) throws WorldAnimalException;
}
