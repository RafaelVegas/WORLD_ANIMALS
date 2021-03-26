package com.world.animals.services;

import com.world.animals.jsons.SpeciesRest;

public interface SpeciesServiceI {

	SpeciesRest  getSpecieByName(String nameSpecie);
}
