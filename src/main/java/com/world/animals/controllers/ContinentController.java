package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.jsons.OneContinentRest;
import com.world.animals.services.ContinentService;

@RestController
@RequestMapping(path = "/world-animals" + "/v1.0")
public class ContinentController {
	
	@Autowired
	ContinentService continentService;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-continente" + "/{" + "idContinene" + "}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public OneContinentRest getContinentById(Long idContinent) {
		return continentService.getContinentByID(idContinent);
	}

}
