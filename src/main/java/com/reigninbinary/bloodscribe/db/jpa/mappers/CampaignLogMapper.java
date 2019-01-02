package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.CampaignLog;
import com.reigninbinary.bloodscribe.db.jpa.entities.CampaignLogEntity;


public class CampaignLogMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static CampaignLog mapModel(CampaignLogEntity entity) {
		
		return modelMapper.map(entity, CampaignLog.class);
	}

	public static CampaignLogEntity mapModel(CampaignLog model) {

		return modelMapper.map(model, CampaignLogEntity.class);
	}		
}
