package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserEntity;


public class UserEntityMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static User mapModel(UserEntity entity) {
		
		return modelMapper.map(entity, User.class);
	}

	public static UserEntity mapModel(User user) {
		
		return modelMapper.map(user, UserEntity.class);
	}		
}
