package com.world.animals.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Continent;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.ContinentAndCountriesRest;
import com.world.animals.jsons.ContinentRest;
import com.world.animals.repositories.ContinentRepository;
import com.world.animals.services.ContinentService;

@Service
public class ContinentServiceImpl implements ContinentService {

	@Autowired
	ContinentRepository continentRepository;

	public static final ModelMapper modelmapper = new ModelMapper();

	// one continent
	public ContinentRest getContinentByID(Long idContinent) throws WorldAnimalException {
		return modelmapper.map(getContinentForMap(idContinent), ContinentRest.class);
	}

	private Continent getContinentForMap(Long idContinent) throws WorldAnimalException {
		return continentRepository.findByIdContinent(idContinent).orElseThrow(
				() -> new NotFoundException("NOT FOUND 404", "continent not found, ID: " + idContinent));
	}

	// continent and its countries
	public ContinentAndCountriesRest getContinentAndCountries(Long idContinent) throws WorldAnimalException {
		return modelmapper.map(getContinentAndCountriesForMap(idContinent), ContinentAndCountriesRest.class);
	}

	private Continent getContinentAndCountriesForMap(Long idContinent) throws NotFoundException {
		return continentRepository.findByIdContinent(idContinent).orElseThrow(
				() -> new NotFoundException("NOT FOUND 404", "continent not found, ID: " + idContinent));
	}

	// all continents in databases
	public List<ContinentRest> getAllContinent() throws WorldAnimalException {
		final List<Continent> continent = continentRepository.findAll();
		return continent.stream().map(cont -> modelmapper
								 .map(cont, ContinentRest.class))
								 .collect(Collectors.toList());
	}

}
