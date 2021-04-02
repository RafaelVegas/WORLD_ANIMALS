package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.jsons.BreedRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.BreedService;

@RestController
@RequestMapping(path = "/world-animals" + "/v1.0")
public class BreedController {
	
	@Autowired
	BreedService breedService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-raza" + "/{" + "idRaza" + "}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<BreedRest> getBreedById(@PathVariable Long idRaza) throws Exception {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK", breedService.getOneBreedById(idRaza));
	}
}
