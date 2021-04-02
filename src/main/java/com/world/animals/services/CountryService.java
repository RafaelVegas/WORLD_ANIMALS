package com.world.animals.services;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.CountryRest;

public interface CountryService {

	CountryRest getCountryByIdCountry(Long idCountry)throws WorldAnimalException;
}
