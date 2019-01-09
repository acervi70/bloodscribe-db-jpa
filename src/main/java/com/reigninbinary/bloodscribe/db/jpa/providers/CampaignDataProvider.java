package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;
import java.util.stream.Collectors;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.Campaign;
import com.reigninbinary.bloodscribe.db.dto.CampaignInformation;
import com.reigninbinary.bloodscribe.db.dto.CampaignLog;
import com.reigninbinary.bloodscribe.db.jpa.mappers.CampaignInformationMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.CampaignLogMapper;
import com.reigninbinary.bloodscribe.db.jpa.mappers.CampaignMapper;
import com.reigninbinary.bloodscribe.db.jpa.queries.CampaignInformationQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.CampaignLogQueries;
import com.reigninbinary.bloodscribe.db.jpa.queries.CampaignQueries;
import com.reigninbinary.bloodscribe.providers.CampaignProvider;

public class CampaignDataProvider implements CampaignProvider {

	@Override
	public Campaign getCampaign(int idCampaign) throws BloodscribeException {

		return CampaignMapper.mapModel(CampaignQueries.findByCampaignId(idCampaign));
	}

	@Override
	public List<Campaign> getCampaigns(int idGameWorld) throws BloodscribeException {

		return CampaignQueries
				.findByGameWorldId(idGameWorld)
				.stream()
				.map(entity -> CampaignMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public CampaignInformation getCampaignInformation(int idInformation) throws BloodscribeException {

		return CampaignInformationMapper.mapModel(CampaignInformationQueries.findByInformationId(idInformation));
	}

	@Override
	public List<CampaignInformation> getAllCampaignInformation(int idCampaign) throws BloodscribeException {

		return CampaignInformationQueries
				.findByCampaignId(idCampaign)
				.stream()
				.map(entity -> CampaignInformationMapper.mapModel(entity))
				.collect(Collectors.toList());
	}

	@Override
	public CampaignLog getCampaignLog(int idCampaignLog) throws BloodscribeException {

		return CampaignLogMapper.mapModel(CampaignLogQueries.findByLogId(idCampaignLog));
	}

	@Override
	public List<CampaignLog> getCampaignLogs(int idCampaign) throws BloodscribeException {

		return CampaignLogQueries
				.findByCampaignId(idCampaign)
				.stream()
				.map(entity -> CampaignLogMapper.mapModel(entity))
				.collect(Collectors.toList());
	}
}
