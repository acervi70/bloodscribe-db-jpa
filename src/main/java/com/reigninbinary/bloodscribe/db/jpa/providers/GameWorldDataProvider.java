package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.jpa.EntityManagerOps;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldDescriptionEntity;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldEntity;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserEntity;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserGameWorldEntity;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldDescriptionMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.GameWorldMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldDescriptionQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.GameWorldQueries;
import com.reigninbinary.bloodscribe.providers.GameWorldProvider;

public class GameWorldDataProvider implements GameWorldProvider {

	@Override
	public GameWorld getGameWorldById(int idGameWorld) throws BloodscribeException {
		
		return GameWorldMapper
				.mapModel(GameWorldQueries.findByGameWorldId(idGameWorld));
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser) throws BloodscribeException {
		
		return GameWorldQueries
				.findByUserId(idUser)
				.stream()
				.map(entity -> GameWorldMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) throws BloodscribeException {
		
		return GameWorldDescriptionMapper
				.mapModel(GameWorldDescriptionQueries.findByDescriptionId(idDescription));
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) throws BloodscribeException {
		
		return GameWorldDescriptionQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> GameWorldDescriptionMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public void createGameWorld(User user, GameWorld gameWorld) throws BloodscribeException {
		
		UserEntity userEntity = UserMapper.mapModel(user);
		GameWorldEntity gameWorldEntity = GameWorldMapper.mapModel(gameWorld);		

		UserGameWorldEntity userGameWorldEntity = new UserGameWorldEntity();
		userGameWorldEntity.setUser(userEntity);
		userGameWorldEntity.setGameWorld(gameWorldEntity);
		
		List<Object> listObjects = new ArrayList<>();
		listObjects.add(gameWorldEntity);
		listObjects.add(userGameWorldEntity);
		EntityManagerOps.insert(listObjects);
	}

	@Override
	public void updateGameWorld(GameWorld gameWorld) throws BloodscribeException {
		
		GameWorldEntity entity = GameWorldMapper.mapModel(gameWorld);		
		EntityManagerOps.update(entity);
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description) throws BloodscribeException {

		GameWorldDescriptionEntity entity = GameWorldDescriptionMapper.mapModel(description);		
		EntityManagerOps.update(entity);
	}
}
