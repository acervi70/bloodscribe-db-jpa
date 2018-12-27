package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the campaigns database table.
 * 
 */
@Entity
@Table(name="campaigns")
@NamedQuery(name="CampaignEntity.findAll", query="SELECT c FROM CampaignEntity c")
public class CampaignEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="campaign_id")
	private int campaignId;

	private String campaign;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public CampaignEntity() {
	}

	public int getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaign() {
		return this.campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}