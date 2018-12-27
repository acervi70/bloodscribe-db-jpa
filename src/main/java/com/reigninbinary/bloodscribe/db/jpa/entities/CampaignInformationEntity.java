package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the campaign_information database table.
 * 
 */
@Entity
@Table(name="campaign_information")
@NamedQuery(name="CampaignInformationEntity.findAll", query="SELECT c FROM CampaignInformationEntity c")
public class CampaignInformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="information_id")
	private int informationId;

	@Column(name="campaign_id")
	private int campaignId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String information;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	private String visible;

	public CampaignInformationEntity() {
	}

	public int getInformationId() {
		return this.informationId;
	}

	public void setInformationId(int informationId) {
		this.informationId = informationId;
	}

	public int getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getInformation() {
		return this.information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

}