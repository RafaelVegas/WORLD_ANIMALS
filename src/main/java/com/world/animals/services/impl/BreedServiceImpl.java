package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Breed;
import com.world.animals.jsons.OneBreedRest;
import com.world.animals.repositories.BreedRepository;
import com.world.animals.services.BreedService;

@Service
public class BreedServiceImpl implements BreedService {

	@Autowired
	BreedRepository breedRepository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public OneBreedRest getOneBreedById(long idRaza)  throws Exception{		
		return modelmapper.map(getBreedForMapeo(idRaza), OneBreedRest.class);
	}
	
	private Breed getBreedForMapeo(Long idRaza) {
		return breedRepository.findByIdBreed(idRaza).orElseThrow();
	}

}
