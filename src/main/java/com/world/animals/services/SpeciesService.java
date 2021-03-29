package com.world.animals.services;

import org.springframework.stereotype.Service;

import com.world.animals.jsons.SpeciesRest;

@Service
public interface SpeciesService {

	SpeciesRest  getSpecieByName(Integer nameSpecie);
}
