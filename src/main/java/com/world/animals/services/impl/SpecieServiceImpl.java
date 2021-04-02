package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Specie;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.SpeciesRest;
import com.world.animals.repositories.SpecieRepository;
import com.world.animals.services.SpecieService;

@Service
public class SpecieServiceImpl implements SpecieService {

	@Autowired
	SpecieRepository repository;

	public static final ModelMapper modelmapper = new ModelMapper();

	@Override
	public SpeciesRest getSpecieByName(Long idSpecie) throws WorldAnimalException {
		return modelmapper.map(getSpecieForMapeo(idSpecie), SpeciesRest.class);
	}

	private Specie getSpecieForMapeo(Long idSpecie) throws WorldAnimalException {
		return repository.findByIdSpecie(idSpecie)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Specie not found, ID: " + idSpecie));
	}

}
