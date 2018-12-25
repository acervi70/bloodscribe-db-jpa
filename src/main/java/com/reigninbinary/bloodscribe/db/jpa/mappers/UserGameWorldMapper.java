package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.UserGameWorld;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserGameWorldEntity;


public class UserGameWorldMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static UserGameWorld mapModel(UserGameWorldEntity entity) {
		
		return modelMapper.map(entity, UserGameWorld.class);
	}		
}
