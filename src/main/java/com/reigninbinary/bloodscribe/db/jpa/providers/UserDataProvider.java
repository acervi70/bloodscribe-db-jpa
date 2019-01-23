package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.EntityManagerOps;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserIdentityTypeMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserProfileItemMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.UserProfileItemTypeMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserIdentityTypeQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserProfileItemQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.UserProfileItemTypeQueries;
import com.reigninbinary.bloodscribe.providers.UserProvider;


public class UserDataProvider implements UserProvider {

	@Override
	public User getUserById(int idUser) {
		
		return UserMapper.mapModel(UserQueries.findByUserId(idUser));
	}

	@Override
	public User getUserByIdentityId(String idIdentity) {
		
		return UserMapper.mapModel(UserQueries.findByIdentityId(idIdentity));
	}

	@Override
	public User getUserByEmailAddress(String emailAddress) {
		
		return UserMapper.mapModel(UserQueries.findByEmailAddress(emailAddress));
	}

	@Override
	public List<UserProfileItem> getUserProfileItems(int idUser) {
		
		 return UserProfileItemQueries.findByUserId(idUser)
				 .stream()
				 .map(entity -> UserProfileItemMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public List<User> getUsers() {
		
		 return UserQueries.findAll()
				 .stream()
				 .map(entity -> UserMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public List<UserIdentityType> getUserIdentityTypes() {
		
		 return UserIdentityTypeQueries.findAll()
				 .stream()
				 .map(entity -> UserIdentityTypeMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public List<UserProfileItemType> getUserProfileItemTypes() {

		 return UserProfileItemTypeQueries.findAll()
				 .stream()
				 .map(entity -> UserProfileItemTypeMapper.mapModel(entity))
				 .collect(Collectors.toList());
	}

	@Override
	public void saveUser(User user) {
		
		EntityManagerOps.update(UserMapper.mapModel(user));
	}

	@Override
	public void saveUserProfileItem(UserProfileItem profileItem) {

		EntityManagerOps.update(UserProfileItemMapper.mapModel(profileItem));
	}

	@Override
	public void saveUserProfileItemType(UserProfileItemType profileItemType) {
		
		BloodscribeEntityManager.getEntityManager()
			.persist( UserProfileItemTypeMapper.mapModel(profileItemType));
	}

	@Override
	public void saveUserIdentityType(UserIdentityType identityType) {

		BloodscribeEntityManager.getEntityManager()
			.persist(UserIdentityTypeMapper.mapModel(identityType));
	}

	@Override
	public void deleteUser(User user) {

		BloodscribeEntityManager.getEntityManager()
			.remove(UserMapper.mapModel(user));
	}

	@Override
	public void deleteUserProfileItem(UserProfileItem profileItem) {

		BloodscribeEntityManager.getEntityManager()
			.remove(UserProfileItemMapper.mapModel(profileItem));
	}

	@Override
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) {
		
		BloodscribeEntityManager.getEntityManager()
			.remove( UserProfileItemTypeMapper.mapModel(profileItemType));
	}

	@Override
	public void deleteUserIdentityType(UserIdentityType identityType) {

		BloodscribeEntityManager.getEntityManager()
			.remove(UserIdentityTypeMapper.mapModel(identityType));
	}
}
