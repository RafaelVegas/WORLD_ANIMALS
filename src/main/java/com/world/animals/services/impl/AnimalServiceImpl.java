package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Animal;
import com.world.animals.jsons.OneAnimalRest;
import com.world.animals.repositories.AnimalRepository;
import com.world.animals.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService{

	@Autowired
	AnimalRepository animalRepository;
	
	private static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public OneAnimalRest getAnimalById(Long id_animal) {		
		return modelmapper.map(getAnimalForMapeo(id_animal), OneAnimalRest.class);
	}
	
	private Animal getAnimalForMapeo(Long id) {
		return animalRepository.findByIdAnimal(id).orElseThrow();
	}

}
