package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.ModelMapper;

import com.reigninbinary.bloodscribe.db.dto.CampaignInformation;
import com.reigninbinary.bloodscribe.db.jpa.entities.CampaignInformationEntity;


public class CampaignInformationMapper {

	private static final ModelMapper modelMapper;
	static {
		modelMapper = new ModelMapper();
		modelMapper.addConverter(ModelMapperConverters.visibleConverter);
	}

	public static CampaignInformation mapModel(CampaignInformationEntity entity) {
		
		return modelMapper.map(entity, CampaignInformation.class);
	}

	public static CampaignInformationEntity mapModel(CampaignInformation model) {

		return modelMapper.map(model, CampaignInformationEntity.class);
	}		
}
