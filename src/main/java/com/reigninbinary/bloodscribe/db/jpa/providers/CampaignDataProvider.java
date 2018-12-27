package com.reigninbinary.bloodscribe.db.jpa.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.Campaign;
import com.reigninbinary.bloodscribe.db.dto.CampaignInformation;
import com.reigninbinary.bloodscribe.db.dto.CampaignLog;
import com.reigninbinary.bloodscribe.providers.CampaignProvider;

public class CampaignDataProvider implements CampaignProvider {

	public CampaignDataProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Campaign getCampaign(int idCampaign) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaign> getCampaigns(int idGameWorld) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CampaignInformation getCampaignInformation(int idInformation) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CampaignInformation> getAllCampaignInformation(int idCampaign) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CampaignLog getCampaignLog(int idCampaignLog) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CampaignLog> getCampaignLogs(int idCampaign) throws BloodscribeException {
		// TODO Auto-generated method stub
		return null;
	}

}
