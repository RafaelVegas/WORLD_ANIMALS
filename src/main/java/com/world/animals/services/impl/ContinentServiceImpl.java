package com.world.animals.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.animals.jsons.OneContinentRest;
import com.world.animals.repositories.ContinentRepository;
import com.world.animals.services.ContinentService;

@Service
public class ContinentServiceImpl implements ContinentService {

	@Autowired
	ContinentRepository continentRepository;

	public static final ModelMapper modelmapper = new ModelMapper();

	@Override
	public OneContinentRest getContinentByID(Long idContinent) {
		return modelmapper.map(getContinentForMapeo(idContinent), OneContinentRest.class);
	}

	private Object getContinentForMapeo(Long idContinent) {
		return continentRepository.findByIdContinent(idContinent);
	}

}
