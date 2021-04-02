package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Country;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.CountryRest;
import com.world.animals.repositories.CountryRepository;
import com.world.animals.services.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	CountryRepository countryRepository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	//search country by ID_PAIS
	public CountryRest getCountryByIdCountry(Long idCountry) throws WorldAnimalException{
		return modelmapper.map(getCountryForMapeo(idCountry), CountryRest.class);
	}

	private Country getCountryForMapeo(Long idCountry) throws WorldAnimalException{
		return countryRepository.findByIdCountry(idCountry).orElseThrow(()-> new NotFoundException("ERROR 404", "Country not found, ID: " + idCountry));
	}

}
