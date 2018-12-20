package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.EntityManagerOps;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserIdentityTypeEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserProfileItemEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserProfileItemTypeEntityMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserIdentityTypeEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserProfileItemEntityQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserProfileItemTypeEntityQueries;
import com.reigninbinary.bloodscribe.providers.UserProvider;


public class UserDataProvider implements UserProvider {

	@Override
	public User getUserById(int idUser) {
		
		return UserEntityMapper.mapModel(UserEntityQueries.findByUserId(idUser));
	}

	@Override
	public User getUserByIdentityId(String idIdentity) {
		
		return UserEntityMapper.mapModel(UserEntityQueries.findByIdentityId(idIdentity));
	}

	@Override
	public User getUserByEmailAddress(String emailAddress) {
		
		return UserEntityMapper.mapModel(UserEntityQueries.findByEmailAddress(emailAddress));
	}

	@Override
	public List<UserProfileItem> getUserProfileItems(int idUser) {
		
		 return UserProfileItemEntityQueries.findByUserId(idUser)
				 .stream()
				 .map(entity -> UserProfileItemEntityMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public List<User> getUsers() {
		
		 return UserEntityQueries.findAll()
				 .stream()
				 .map(entity -> UserEntityMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public List<UserIdentityType> getUserIdentityTypes() {
		
		 return UserIdentityTypeEntityQueries.findAll()
				 .stream()
				 .map(entity -> UserIdentityTypeEntityMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public List<UserProfileItemType> getUserProfileItemTypes() {

		 return UserProfileItemTypeEntityQueries.findAll()
				 .stream()
				 .map(entity -> UserProfileItemTypeEntityMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public void saveUser(User user) {
		
		EntityManagerOps.save(UserEntityMapper.mapModel(user));
	}

	@Override
	public void saveUserProfileItem(UserProfileItem profileItem) {

		EntityManagerOps.save(UserProfileItemEntityMapper.mapModel(profileItem));
	}

	@Override
	public void saveUserProfileItemType(UserProfileItemType profileItemType) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist( UserProfileItemTypeEntityMapper.mapModel(profileItemType));
	}

	@Override
	public void saveUserIdentityType(UserIdentityType identityType) {

		BloodscribeEntityManager.getEntityManager()
			.persist(UserIdentityTypeEntityMapper.mapModel(identityType));
	}

	@Override
	public void deleteUser(User user) {

		BloodscribeEntityManager.getEntityManager()
			.remove(UserEntityMapper.mapModel(user));
	}

	@Override
	public void deleteUserProfileItem(UserProfileItem profileItem) {

		BloodscribeEntityManager.getEntityManager()
			.remove(UserProfileItemEntityMapper.mapModel(profileItem));
	}

	@Override
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) {
		
		BloodscribeEntityManager.getEntityManager()
			.remove( UserProfileItemTypeEntityMapper.mapModel(profileItemType));
	}

	@Override
	public void deleteUserIdentityType(UserIdentityType identityType) {

		BloodscribeEntityManager.getEntityManager()
			.remove(UserIdentityTypeEntityMapper.mapModel(identityType));
	}
}
