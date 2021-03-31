package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.OneContinentAndCountriesRest;
import com.world.animals.jsons.OneContinentRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.ContinentService;

@RestController
@RequestMapping(path = "/world-animal" + "/v1.0")
public class ContinentController {

	@Autowired
	ContinentService continentService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-continent" + "/{" + "id continente"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<OneContinentRest> getContinentByID(Long idContinent) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK.value()), "OK",
				continentService.getContinentByID(idContinent));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-continent-countries" + "/{" + "id continente"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<OneContinentAndCountriesRest> getContinentAndCountries(Long idContinent) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK.value()), "OK",
				continentService.getContinentAndCountries(idContinent));
	}

}
