package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldEntity;


public class GameWorldMapper {

	private static final ModelMapper modelMapper;
	static {
		modelMapper = new ModelMapper();
		modelMapper.addConverter(ModelMapperConverters.readonlyConverter);
	}

	public static GameWorld mapModel(GameWorldEntity entity) {
		
		return modelMapper.map(entity, GameWorld.class);
	}

	public static GameWorldEntity mapModel(GameWorld gameWorld) {

		return modelMapper.map(gameWorld, GameWorldEntity.class);
	}		
}
