package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserProfileItemEntity;


public class UserProfileItemEntityMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static UserProfileItem mapModel(UserProfileItemEntity entity) {
		
		return modelMapper.map(entity, UserProfileItem.class);
	}

	public static UserProfileItemEntity mapModel(UserProfileItem profileItem) {

		return modelMapper.map(profileItem, UserProfileItemEntity.class);
	}
}
