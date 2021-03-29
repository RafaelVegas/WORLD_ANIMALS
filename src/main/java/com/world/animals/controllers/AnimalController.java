package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.jsons.OneAnimalRest;
import com.world.animals.services.AnimalService;

@RestController
@RequestMapping(path = "/animals" + "/v1.0")
public class AnimalController {

	@Autowired
	AnimalService animalService;
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "id" + "/{" + "idAnimal" + "}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public OneAnimalRest getOneAnimalById(Long id_animal) {
		return animalService.getAnimalById(id_animal);
	}
}
