package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.bloodscribe.db.jpa.entities.LocationTimelineEntity;


public class LocationTimelineMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static LocationTimeline mapModel(LocationTimelineEntity entity) {
		
		return modelMapper.map(entity, LocationTimeline.class);
	}

	public static LocationTimelineEntity mapModel(LocationTimeline timeline) {

		return modelMapper.map(timeline, LocationTimelineEntity.class);
	}		
}
