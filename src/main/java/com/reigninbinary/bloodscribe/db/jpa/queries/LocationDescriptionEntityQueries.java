package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.LocationDescriptionEntity;


public class LocationDescriptionEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM LocationDescriptionEntity u";
	

	public static LocationDescriptionEntity findByDescriptionId(int idDescription) {

		return BloodscribeEntityManager.getEntityManager()
	    		.find(LocationDescriptionEntity.class, idDescription);
	}
	
	@SuppressWarnings("unchecked")
	public static List<LocationDescriptionEntity> findByLocationId(int idLocation) {
		
		final String COLUMN = "location_id";
		final String PARAM = ":location-id";		
		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);

	    return BloodscribeEntityManager.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idLocation)
	    		.getResultList();
	}
}
