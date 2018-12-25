package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.jpa.entities.BaseLocationTypeEntity;


public class BaseLocationTypeMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static BaseLocationType mapModel(BaseLocationTypeEntity entity) {
		
		return modelMapper.map(entity, BaseLocationType.class);
	}

	public static BaseLocationTypeEntity mapModel(BaseLocationType locationType) {
		
		return modelMapper.map(locationType, BaseLocationTypeEntity.class);
	}
}
