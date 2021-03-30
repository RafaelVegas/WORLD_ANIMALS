package com.world.animals.exceptions;

import java.util.LinkedList;
import java.util.List;

import com.world.animals.dtos.ErrorDto;

public class WorldAnimalException extends Exception {

	private static final long serialVersionUID = 1L;

	private final String code;

	private final int responseCode;

	private final List<ErrorDto> errorDto = new LinkedList<>();

	public WorldAnimalException(String code, int responseCode, String message) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
	}

	public WorldAnimalException(String code, int responseCode, List<ErrorDto> errorDto, String message) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
		this.errorDto.addAll(errorDto);
	}

	public String getCode() {
		return code;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public List<ErrorDto> getErrorDto() {
		return errorDto;
	}

}
