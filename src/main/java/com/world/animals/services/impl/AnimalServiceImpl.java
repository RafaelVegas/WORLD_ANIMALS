package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Animal;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.AnimalRest;
import com.world.animals.jsons.AnimalSpecieBreedRest;
import com.world.animals.repositories.AnimalRepository;
import com.world.animals.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	AnimalRepository animalRepository;

	private static final ModelMapper modelmapper = new ModelMapper();

	// Search animal by its ID_ANIMAL
	public AnimalRest getAnimalById(Long id_animal) throws WorldAnimalException {
		return modelmapper.map(getAnimalForMapeo(id_animal), AnimalRest.class);
	}

	private Animal getAnimalForMapeo(Long id) throws WorldAnimalException {
		return animalRepository.findByIdAnimal(id)
				.orElseThrow(() -> new NotFoundException("ERROR 404", "Animal not found, ID: " + id));
	}

	@Override
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

}
