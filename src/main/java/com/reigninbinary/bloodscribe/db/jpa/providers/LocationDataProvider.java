package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.mappers.BaseLocationTypeEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldLocationEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldLocationTypeEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.LocationDescriptionEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.LocationTimelineEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.BaseLocationTypeEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldLocationEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldLocationTypeEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.LocationDescriptionEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.LocationTimelineEntityQueries;
import com.reigninbinary.bloodscribe.providers.LocationProvider;


public class LocationDataProvider implements LocationProvider {

	@Override
	public BaseLocationType getBaseLocationTypeById(int idLocationType) {
		
		return BaseLocationTypeEntityMapper
				.mapModel(BaseLocationTypeEntityQueries
						.findByLocationTypeId(idLocationType));
	}

	@Override
	public List<BaseLocationType> getBaseLocationTypes() {
		
		return BaseLocationTypeEntityQueries
				.findAll()
				.stream()
				.map(entity -> BaseLocationTypeEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType) {

		return GameWorldLocationTypeEntityMapper
				.mapModel(GameWorldLocationTypeEntityQueries
						.findByLocationTypeId(idGameWorld, idLocationType));
	}

	@Override
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) {

		return GameWorldLocationTypeEntityQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldLocationTypeEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldLocation getLocationById(int idLocation) {
		
		return GameWorldLocationEntityMapper
				.mapModel(GameWorldLocationEntityQueries.findByLocationId(idLocation));
	}

	@Override
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) {
		
		return GameWorldLocationEntityQueries
				.findByParentId(idParentLocation)
				.stream()
				.map(entity -> GameWorldLocationEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) {
		
		return GameWorldLocationEntityQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldLocationEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) {
		
		return GameWorldLocationEntityQueries
				.findLocationsWithNoParent(idGameWorld)
				.stream()
				.map(entity -> GameWorldLocationEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public LocationDescription getLocationDescriptionById(int idDescription) {
		
		return LocationDescriptionEntityMapper
				.mapModel(LocationDescriptionEntityQueries.findByDescriptionId(idDescription));
	}

	@Override
	public List<LocationDescription> getLocationDescriptions(int idLocation) {
		
		return LocationDescriptionEntityQueries
				.findByLocationId(idLocation)
				.stream()
				.map(entity -> LocationDescriptionEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public LocationTimeline getLocationTimelineById(int idTimeline) {
		
		return LocationTimelineEntityMapper
				.mapModel(LocationTimelineEntityQueries.findByTimelineId(idTimeline));
	}

	@Override
	public List<LocationTimeline> getLocationTimelines(int idLocation) {
		
		return LocationTimelineEntityQueries
				.findByLocationId(idLocation)
				.stream()
				.map(entity -> LocationTimelineEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public void saveBaseLocationType(BaseLocationType type) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(BaseLocationTypeEntityMapper.mapModel(type));
	}

	@Override
	public void saveGameWorldLocationType(GameWorldLocationType type) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(GameWorldLocationTypeEntityMapper.mapModel(type));
	}

	@Override
	public void saveGameWorldLocation(GameWorldLocation location) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(GameWorldLocationEntityMapper.mapModel(location));
	}

	@Override
	public void saveLocationDescription(LocationDescription descripton) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(LocationDescriptionEntityMapper.mapModel(descripton));
	}

	@Override
	public void saveLocationTimeline(LocationTimeline timeline) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist(LocationTimelineEntityMapper.mapModel(timeline));
	}
}
