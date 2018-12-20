package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldDescriptionEntity;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldEntity;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldDescriptionEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldDescriptionEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldEntityQueries;
import com.reigninbinary.bloodscribe.providers.GameWorldProvider;

public class GameWorldDataProvider implements GameWorldProvider {

	@Override
	public GameWorld getGameWorldById(int idGameWorld) {
		
		return GameWorldEntityMapper
				.mapModel(GameWorldEntityQueries.findByGameWorldId(idGameWorld));
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser) {
		
		return GameWorldEntityQueries
				.findByUserId(idUser)
				.stream()
				.map(entity -> GameWorldEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) {
		
		return GameWorldDescriptionEntityMapper
				.mapModel(GameWorldDescriptionEntityQueries.findByDescriptionId(idDescription));
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) {
		
		return GameWorldDescriptionEntityQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldDescriptionEntityMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public void saveGameWorld(GameWorld gameWorld) {
		
		GameWorldEntity entity = GameWorldEntityMapper.mapModel(gameWorld);		
		BloodscribeEntityManager.getEntityManager().persist(entity);
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description) {

		GameWorldDescriptionEntity entity = GameWorldDescriptionEntityMapper.mapModel(description);		
		BloodscribeEntityManager.getEntityManager().persist(entity);
	}

}
