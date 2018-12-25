package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.mappers.BaseLocationTypeMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldLocationMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldLocationTypeMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.LocationDescriptionMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.LocationTimelineMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.BaseLocationTypeQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldLocationQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldLocationTypeQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.LocationDescriptionQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.LocationTimelineQueries;
import com.reigninbinary.bloodscribe.providers.LocationProvider;


public class LocationDataProvider implements LocationProvider {

	@Override
	public BaseLocationType getBaseLocationTypeById(int idLocationType) {
		
		return BaseLocationTypeMapper
				.mapModel(BaseLocationTypeQueries
						.findByLocationTypeId(idLocationType));
	}

	@Override
	public List<BaseLocationType> getBaseLocationTypes() {
		
		return BaseLocationTypeQueries
				.findAll()
				.stream()
				.map(entity -> BaseLocationTypeMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType) {

		return GameWorldLocationTypeMapper
				.mapModel(GameWorldLocationTypeQueries
						.findByLocationTypeId(idGameWorld, idLocationType));
	}

	@Override
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) {

		return GameWorldLocationTypeQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldLocationTypeMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldLocation getLocationById(int idLocation) {
		
		return GameWorldLocationMapper
				.mapModel(GameWorldLocationQueries.findByLocationId(idLocation));
	}

	@Override
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) {
		
		return GameWorldLocationQueries
				.findByParentId(idParentLocation)
				.stream()
				.map(entity -> GameWorldLocationMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) {
		
		return GameWorldLocationQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldLocationMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) {
		
		return GameWorldLocationQueries
				.findLocationsWithNoParent(idGameWorld)
				.stream()
				.map(entity -> GameWorldLocationMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public LocationDescription getLocationDescriptionById(int idDescription) {
		
		return LocationDescriptionMapper
				.mapModel(LocationDescriptionQueries.findByDescriptionId(idDescription));
	}

	@Override
	public List<LocationDescription> getLocationDescriptions(int idLocation) {
		
		return LocationDescriptionQueries
				.findByLocationId(idLocation)
				.stream()
				.map(entity -> LocationDescriptionMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public LocationTimeline getLocationTimelineById(int idTimeline) {
		
		return LocationTimelineMapper
				.mapModel(LocationTimelineQueries.findByTimelineId(idTimeline));
	}

	@Override
	public List<LocationTimeline> getLocationTimelines(int idLocation) {
		
		return LocationTimelineQueries
				.findByLocationId(idLocation)
				.stream()
				.map(entity -> LocationTimelineMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public void saveBaseLocationType(BaseLocationType type) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(BaseLocationTypeMapper.mapModel(type));
	}

	@Override
	public void saveGameWorldLocationType(GameWorldLocationType type) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(GameWorldLocationTypeMapper.mapModel(type));
	}

	@Override
	public void saveGameWorldLocation(GameWorldLocation location) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(GameWorldLocationMapper.mapModel(location));
	}

	@Override
	public void saveLocationDescription(LocationDescription descripton) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(LocationDescriptionMapper.mapModel(descripton));
	}

	@Override
	public void saveLocationTimeline(LocationTimeline timeline) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(LocationTimelineMapper.mapModel(timeline));
	}
}
