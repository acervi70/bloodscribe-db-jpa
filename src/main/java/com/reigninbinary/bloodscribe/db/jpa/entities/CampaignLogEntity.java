package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the campaign_log database table.
 * 
 */
@Entity
@Table(name="campaign_log")
@NamedQuery(name="CampaignLogEntity.findAll", query="SELECT c FROM CampaignLogEntity c")
public class CampaignLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="log_id")
	private int logId;

	@Column(name="campaign_id")
	private int campaignId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	@Column(name="location_id")
	private int locationId;

	@Column(name="log_entry")
	private String logEntry;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public CampaignLogEntity() {
	}

	public int getLogId() {
		return this.logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
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

	public int getLocationId() {
		return this.locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLogEntry() {
		return this.logEntry;
	}

	public void setLogEntry(String logEntry) {
		this.logEntry = logEntry;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}