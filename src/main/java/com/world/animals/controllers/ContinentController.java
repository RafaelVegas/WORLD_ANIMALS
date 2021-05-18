package com.world.animals.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.ContinentAndCountriesRest;
import com.world.animals.jsons.ContinentRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.ContinentService;

@RestController
@RequestMapping(path = "/world-animals" + "/v1.0")
public class ContinentController {

	@Autowired
	ContinentService continentService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-continent" + "/{" + "id continente"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<ContinentRest> getContinentByID(@PathVariable Long idContinent) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK.value()), "OK",
				continentService.getContinentByID(idContinent));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-continent-countries" + "/{" + "id continente"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<ContinentAndCountriesRest> getContinentAndCountries(@PathVariable Long idContinent) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK.value()), "OK",
				continentService.getContinentAndCountries(idContinent));
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "all-continents", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<List<ContinentRest>> getAllContinents() throws WorldAnimalException{
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK", continentService.getAllContinent());
	}

}
