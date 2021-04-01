package com.world.animals.services.impl;

import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Animal;
import com.world.animals.entities.Continent;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalRest;
import com.world.animals.jsons.AnimalSpecieRest;
import com.world.animals.jsons.AnimalsContinentRest;
import com.world.animals.repositories.AnimalRepository;
import com.world.animals.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	AnimalRepository animalRepository;

	private static final ModelMapper modelmapper = new ModelMapper();

	// Search animal by its ID_ANIMAL
	public AnimalRest getAnimalById(Long id_animal) throws WorldAnimalException {
		return modelmapper.map(getAnimalForMapeo(id_animal), AnimalRest.class);
	}

	private Animal getAnimalForMapeo(Long id) throws WorldAnimalException {
		return animalRepository.findByIdAnimal(id)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Animal no encontrado con ID: " + id));
	}

	// pendint
	public AnimalsContinentRest getAnimalsOfContinent(Set<Continent> rContinent) {
		return null;
	}

	@Override
	public AnimalSpecieRest getAnimalSpecieByIdAnimal(Long idAnimal) throws WorldAnimalException {
		return modelmapper.map(getAnimalAndSpecie(idAnimal), AnimalSpecieRest.class);
	}

	private Animal getAnimalAndSpecie(Long idAnimal) throws NotFoundException {
		return animalRepository.findById(idAnimal)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Animal no encontrado con ID: " + idAnimal));
	}

}
