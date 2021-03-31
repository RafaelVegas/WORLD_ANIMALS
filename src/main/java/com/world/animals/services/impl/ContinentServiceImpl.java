package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.entities.Continent;
import com.world.animals.exceptions.NotFoundException;
import com.world.animals.exceptions.WorldAnimalException;
import com.world.animals.jsons.OneContinentRest;
import com.world.animals.repositories.ContinentRepository;
import com.world.animals.services.ContinentService;

@Service
public class ContinentServiceImpl implements ContinentService{

	@Autowired
	ContinentRepository continentRepository;
	
	public static final ModelMapper modelmapper = new ModelMapper();
	
	@Override
	public OneContinentRest getContinentByID(Long idContinent) throws WorldAnimalException {
		return modelmapper.map(getContinentForMap(idContinent), OneContinentRest.class);
	}

	private Continent getContinentForMap(Long idContinent) throws WorldAnimalException {
		return continentRepository.findByIdContinent(idContinent)
				.orElseThrow(() -> new NotFoundException("NOT FOUND 404", "No se ha encomtrado continent con ID: " + idContinent));
	}

}
