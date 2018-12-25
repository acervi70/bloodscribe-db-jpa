package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserIdentityTypeEntity;


public class UserIdentityTypeMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static UserIdentityType mapModel(UserIdentityTypeEntity entity) {
		
		return modelMapper.map(entity, UserIdentityType.class);
	}

	public static UserIdentityTypeEntity mapModel(UserIdentityType identityType) {

		return modelMapper.map(identityType, UserIdentityTypeEntity.class);
	}
}
