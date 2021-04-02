package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Breed;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.BreedRest;
import com.world.animals.repositories.BreedRepository;
import com.world.animals.services.BreedService;

@Service
public class BreedServiceImpl implements BreedService {

	@Autowired
	BreedRepository breedRepository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public BreedRest getOneBreedById(long idRaza)  throws WorldAnimalException{		
		return modelmapper.map(getBreedForMapeo(idRaza), BreedRest.class);
	}
	
	private Breed getBreedForMapeo(Long idRaza) throws NotFoundException {
		return breedRepository.findByIdBreed(idRaza).orElseThrow(()-> new NotFoundException("ERROR 404", "Breed not found with ID: " + idRaza));
	}

}
