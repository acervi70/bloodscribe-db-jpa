package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldLocationEntity;


public class GameWorldLocationMapper {

	private static final ModelMapper modelMapper;
	static {
		modelMapper = new ModelMapper();
		modelMapper.addConverter(ModelMapperConverters.visibleConverter);
	}

	public static GameWorldLocation mapModel(GameWorldLocationEntity entity) {
		
		return modelMapper.map(entity, GameWorldLocation.class);
	}		
	
	public static GameWorldLocationEntity mapModel(GameWorldLocation dto) {
		
		return modelMapper.map(dto, GameWorldLocationEntity.class);
	}			
}
