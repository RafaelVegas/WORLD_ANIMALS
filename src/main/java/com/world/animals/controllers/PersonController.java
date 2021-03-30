package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.jsons.OnePersonRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.PersonService;

@RestController
@RequestMapping(path = "/world-animal" + "/v1.0")
public class PersonController {

	@Autowired
	PersonService personService;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-person"+"/{"+"idPerson"+"}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<OnePersonRest> getPersonById(@PathVariable Long idPerson) {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK", personService.getPersonById(idPerson));
	}
}
