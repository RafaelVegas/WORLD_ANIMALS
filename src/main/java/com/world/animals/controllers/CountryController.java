package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.jsons.CountryRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.CountryService;

@RestController
@RequestMapping(path = "/world-animals" + "/v1.0")
public class CountryController {
	
	@Autowired
	CountryService countryService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-pais"+ "/{" + "id pais" + "}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<CountryRest> getCountryByIdCountry(Long idCountry) {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK", countryService.getCountryByIdCountry(idCountry));
	}
}
