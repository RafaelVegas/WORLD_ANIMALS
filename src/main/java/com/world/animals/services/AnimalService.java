package com.world.animals.services;

import com.world.animals.jsons.OneAnimalRest;

public interface AnimalService {

	OneAnimalRest getAnimalById(Long id_animal);
}
