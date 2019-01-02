package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.Campaign;
import com.reigninbinary.bloodscribe.db.jpa.entities.CampaignEntity;

public class GameWorldCampaignMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static Campaign mapModel(CampaignEntity entity) {
		
		return modelMapper.map(entity, Campaign.class);
	}

	public static CampaignEntity mapModel(Campaign model) {

		return modelMapper.map(model, CampaignEntity.class);
	}		
}
