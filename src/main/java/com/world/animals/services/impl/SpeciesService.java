package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.jsons.SpeciesRest;
import com.world.animals.repositories.SpeciesRepository;
import com.world.animals.services.SpeciesServiceI;
import com.world.animals.entities.Species;

@Service
public class SpeciesService implements SpeciesServiceI {

	@Autowired
	SpeciesRepository repository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public SpeciesRest getSpecieByName(String nameSpecie) {
		return modelmapper.map(getSpecieForMapeo(nameSpecie),SpeciesRest.class);
	}
	
	private Species getSpecieForMapeo(String nameSpecie) {
		return repository.getSpeciesByName(nameSpecie).orElseThrow();
	}

}
