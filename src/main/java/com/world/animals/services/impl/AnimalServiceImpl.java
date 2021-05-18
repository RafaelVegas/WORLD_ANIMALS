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
import com.world.animals.jsons.AnimalModifyRest;
import com.world.animals.jsons.AnimalAllRest;
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
	public AnimalAllRest getAnimalById(Long id_animal) throws WorldAnimalException {
		return modelmapper.map(getAnimalForMapeo(id_animal), AnimalAllRest.class);
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
			throw new InternalServerErrorException("ERROR " + String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR),
					"ERROR creating entity Animal: " + animalRest.getNombre());
		}

		return "Created correctly";
	}

	// borrar un animal
	@Override
	public String deleteAnimal(String animalNombre) throws WorldAnimalException {
		final Animal animal = animalRepository.findByNombre(animalNombre.toUpperCase());
		try {
			animalRepository.deleteById(animal.getIdAnimal());
		} catch (Exception e) {
			LOGGER.error("Internal Server ERROR", e);
			throw new InternalServerErrorException("ERROR " + String.valueOf(HttpStatus.OK),
					"ERROR deleting entity Animal: " + animalNombre);
		}
		return "Deleted correctly";
	}

	public String modifyAnimal(AnimalModifyRest animalModify) throws WorldAnimalException {				
		final Specie specie = specieRepository.findByIdSpecie(animalModify.getIdSpecie()).orElseThrow(
				() -> new NotFoundException("ERROR 404", "Specie not found, nameSpecie: " + animalModify.getIdSpecie()));	
		
		final Animal animal =this.animalRepository.findByIdAnimal(animalModify.getIdAnimal()).orElseThrow(
				() -> new NotFoundException("ERROR 404", "Animal not found, animal name: " + animalModify.getNombre()));
		
		animal.setIdAnimal(animalModify.getIdAnimal());
		animal.setDomestico(true);
		animal.setNombre(animalModify.getNombre());
		animal.setPropiedad(animalModify.getPropiedad());
		animal.setVidaMedia(animalModify.getVidaMedia());
		animal.setSpecie(specie);
		
		try {
			this.animalRepository.save(animal);
		}catch (Exception e) {
			LOGGER.error("INTERNAL SERVER ERROR ",e);
			throw new InternalServerErrorException("ERROR: " + HttpStatus.INTERNAL_SERVER_ERROR,"Error modifying the animal");
		}
		
		return null;
	}

}
