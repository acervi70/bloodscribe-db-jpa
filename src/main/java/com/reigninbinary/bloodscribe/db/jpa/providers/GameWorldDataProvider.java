package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldDescriptionEntity;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldEntity;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldDescriptionMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldDescriptionQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldQueries;
import com.reigninbinary.bloodscribe.providers.GameWorldProvider;

public class GameWorldDataProvider implements GameWorldProvider {

	@Override
	public GameWorld getGameWorldById(int idGameWorld) {
		
		return GameWorldMapper
				.mapModel(GameWorldQueries.findByGameWorldId(idGameWorld));
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser) {
		
		return GameWorldQueries
				.findByUserId(idUser)
				.stream()
				.map(entity -> GameWorldMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) {
		
		return GameWorldDescriptionMapper
				.mapModel(GameWorldDescriptionQueries.findByDescriptionId(idDescription));
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) {
		
		return GameWorldDescriptionQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldDescriptionMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public void saveGameWorld(GameWorld gameWorld) {
		
		GameWorldEntity entity = GameWorldMapper.mapModel(gameWorld);		
		BloodscribeEntityManager.getEntityManager().persist(entity);
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description) {

		GameWorldDescriptionEntity entity = GameWorldDescriptionMapper.mapModel(description);		
		BloodscribeEntityManager.getEntityManager().persist(entity);
	}

}
