package com.world.animals.services;

import com.world.animals.jsons.OneContinentRest;

public interface ContinentService {

	OneContinentRest getContinentByID(Long idContinent);
}
