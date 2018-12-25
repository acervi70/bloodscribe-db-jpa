package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.jpa.entities.LocationDescriptionEntity;


public class LocationDescriptionMapper {

	private static final ModelMapper modelMapper;
	static {
		modelMapper = new ModelMapper();
		modelMapper.addConverter(ModelMapperConverters.visibleConverter);
	}

	public static LocationDescription mapModel(LocationDescriptionEntity entity) {
		
		return modelMapper.map(entity, LocationDescription.class);
	}

	public static LocationDescriptionEntity mapModel(LocationDescription descripton) {

		return modelMapper.map(descripton, LocationDescriptionEntity.class);
	}		
}
