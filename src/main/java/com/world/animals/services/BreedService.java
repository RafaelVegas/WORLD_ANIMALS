package com.world.animals.services;

import com.world.animals.jsons.OneBreedRest;

public interface BreedService{

	OneBreedRest getOneBreedById(long idBreed) throws Exception;
}
