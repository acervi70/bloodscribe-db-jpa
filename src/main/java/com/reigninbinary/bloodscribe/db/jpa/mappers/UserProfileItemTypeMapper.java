package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserProfileItemTypeEntity;


public class UserProfileItemTypeMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static UserProfileItemType mapModel(UserProfileItemTypeEntity entity) {
		
		return modelMapper.map(entity, UserProfileItemType.class);
	}

	public static UserProfileItemTypeEntity mapModel(UserProfileItemType model) {

		return modelMapper.map(model, UserProfileItemTypeEntity.class);
	}		
}
