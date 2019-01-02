package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldLocationTypeEntity;


public class GameWorldLocationTypeMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static GameWorldLocationType mapModel(GameWorldLocationTypeEntity entity) {
		
		return modelMapper.map(entity, GameWorldLocationType.class);
	}

	public static GameWorldLocationTypeEntity mapModel(GameWorldLocationType model) {
		
		return modelMapper.map(model, GameWorldLocationTypeEntity.class);
	}		
}
