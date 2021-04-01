package com.world.animals.services;

import java.util.Set;

import com.world.animals.entities.Continent;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalRest;
import com.world.animals.jsons.AnimalSpecieRest;
import com.world.animals.jsons.AnimalsContinentRest;

public interface AnimalService {

	AnimalRest getAnimalById(Long id_animal) throws WorldAnimalException;
	
	AnimalsContinentRest getAnimalsOfContinent(Set<Continent> rContinent) throws WorldAnimalException;
	
	AnimalSpecieRest getAnimalSpecieByIdAnimal(Long id) throws WorldAnimalException;
}
