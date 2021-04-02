package com.world.animals.exceptions;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.world.animals.dtos.ErrorDto;

public class NotFoundException extends WorldAnimalException{

	public NotFoundException(String code, List<ErrorDto> errorDto, String message) {
		super(code, HttpStatus.NOT_FOUND.value(), errorDto, message);
	}
	
	public NotFoundException(String code, String message) {
		super(code,HttpStatus.NOT_FOUND.value(),message);
	}

	private static final long serialVersionUID = 1L;

}
