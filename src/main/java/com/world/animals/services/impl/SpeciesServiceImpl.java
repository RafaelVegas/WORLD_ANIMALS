package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.jsons.SpeciesRest;
import com.world.animals.repositories.SpeciesRepository;
import com.world.animals.services.SpeciesService;
import com.world.animals.entities.Species;

@Service
public class SpeciesServiceImpl implements SpeciesService {

	@Autowired
	SpeciesRepository repository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public SpeciesRest getSpecieByName(Long especie_nombre) {
		return modelmapper.map(getSpecieForMapeo(especie_nombre),SpeciesRest.class);
	}
	
	private Species getSpecieForMapeo(Long especie_nombre) {
		return repository.findByIdEspecie(especie_nombre).orElseThrow();
	}

}
