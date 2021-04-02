package com.world.animals.services;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.BreedRest;

public interface BreedService{

	BreedRest getOneBreedById(long idBreed) throws WorldAnimalException;
}
