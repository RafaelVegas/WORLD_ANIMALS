package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Animal;
import com.world.animals.entities.Specie;
import com.world.animals.exceptions.InternalServerErrorException;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalRest;
import com.world.animals.jsons.AnimalSpecieBreedRest;
import com.world.animals.jsons.CreateAnimalRest;
import com.world.animals.repositories.AnimalRepository;
import com.world.animals.repositories.SpecieRepository;
import com.world.animals.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AnimalServiceImpl.class);

	@Autowired
	AnimalRepository animalRepository;

	@Autowired
	SpecieRepository specieRepository;

	private static final ModelMapper modelmapper = new ModelMapper();

	// Search animal by its ID_ANIMAL
	public AnimalRest getAnimalById(Long id_animal) throws WorldAnimalException {
		return modelmapper.map(getAnimalForMapeo(id_animal), AnimalRest.class);
	}

	private Animal getAnimalForMapeo(Long id) throws WorldAnimalException {
		return animalRepository.findByIdAnimal(id)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Animal not found, ID: " + id));
	}

	// search one animal, specie and its breeds in DataBase
	public AnimalSpecieBreedRest getAnimalSpecieByIdAnimal(Long idAnimal) throws WorldAnimalException {
		return modelmapper.map(getAnimalAndSpecie(idAnimal), AnimalSpecieBreedRest.class);
	}

	private Animal getAnimalAndSpecie(Long idAnimal) throws WorldAnimalException {
		return animalRepository.getAnimalSpecieBreeds(idAnimal)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Animal not found, ID: " + idAnimal));
	}

	// create a animal
	public String createOneAnimal(CreateAnimalRest animalRest) throws WorldAnimalException {
		final Specie specie = specieRepository.findByNameSpecie(animalRest.getSpecie()).orElseThrow(
				() -> new NotFoundException("ERROR 404", "Specie not found, nameSpecie: " + animalRest.getSpecie()));

		final Animal animal = new Animal();
		animal.setNombre(animalRest.getNombre());
		animal.setPropiedad(animalRest.getPropiedad());
		animal.setDomestico(animalRest.isDomestico());
		animal.setVidaMedia(animalRest.getVidaMedia());
		animal.setSpecie(specie);

		try {
			animalRepository.save(animal);
		} catch (Exception e) {
			LOGGER.error("Internal SERVER ERROR", e);
			throw new InternalServerErrorException("ERROR " + String.valueOf(HttpStatus.OK),
					"ERROR creating entity Animal: " + animalRest.getNombre());
		}

		return "Created correctly";
	}

}
