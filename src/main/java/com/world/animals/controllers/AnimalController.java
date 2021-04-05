package com.world.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalRest;
import com.world.animals.jsons.AnimalSpecieBreedRest;
import com.world.animals.jsons.CreateAnimalRest;
import com.world.animals.responses.WorldAnimalsResponse;
import com.world.animals.services.AnimalService;

@RestController
@RequestMapping(path = "/world-animal" + "/v1.0")
public class AnimalController {

	@Autowired
	AnimalService animalService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "search-animal" + "/{" + "idAnimal"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<AnimalRest> getOneAnimalById(@PathVariable Long id_animal) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK",
				animalService.getAnimalById(id_animal));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "search-animal-specie-breeds" + "/{" + "idAnimal"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<AnimalSpecieBreedRest> getAnimalAndSpecie(Long id) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK",
				animalService.getAnimalSpecieByIdAnimal(id));
	}

	// create a animal
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "create-animal", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public WorldAnimalsResponse<String> createOneAnimal(@RequestBody CreateAnimalRest animalRest) throws WorldAnimalException {
		return new WorldAnimalsResponse<>("SUCESS", String.valueOf(HttpStatus.OK), "OK",
				animalService.createOneAnimal(animalRest));
	}
}
