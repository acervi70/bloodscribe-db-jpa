package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldDescriptionEntity;


public class GameWorldDescriptionEntityMapper {
	
	private static final ModelMapper modelMapper;
	static {
		modelMapper = new ModelMapper();
		modelMapper.addConverter(BloodscribeModelMapperConverters.visibleConverter);
	}

	public static GameWorldDescription mapModel(GameWorldDescriptionEntity entity) {
		
		return modelMapper.map(entity, GameWorldDescription.class);
	}

	public static GameWorldDescriptionEntity mapModel(GameWorldDescription description) {

		return modelMapper.map(description, GameWorldDescriptionEntity.class);
	}		
}
