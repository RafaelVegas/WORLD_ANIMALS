package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.SpeciesRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.impl.SpecieServiceImpl;

@RestController
@RequestMapping(path = "/species-animals" + "v1")
public class SpecieController {

	@Autowired
	SpecieServiceImpl speciesService;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-specie" + "/{" + "idSpecie" + "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<SpeciesRest> getOneSpecie(@PathVariable Long idSpecie) throws WorldAnimalException{
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK",speciesService.getSpecieByName(idSpecie));
	}
}
