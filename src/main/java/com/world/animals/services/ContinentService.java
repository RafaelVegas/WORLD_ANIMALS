package com.world.animals.services;

import java.util.List;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.OneContinentAndCountriesRest;
import com.world.animals.jsons.ContinentRest;

public interface ContinentService {

	ContinentRest getContinentByID(Long idContinent) throws WorldAnimalException;
	
	OneContinentAndCountriesRest getContinentAndCountries(Long idContinent) throws WorldAnimalException;
	
	List<ContinentRest> getAllContinent() throws WorldAnimalException;
}
