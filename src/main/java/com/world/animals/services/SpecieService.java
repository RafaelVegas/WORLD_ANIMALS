package com.world.animals.services;

import org.springframework.stereotype.Service;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.SpeciesRest;

@Service
public interface SpecieService {

	SpeciesRest  getSpecieByName(Long idSpecie) throws WorldAnimalException;
}
