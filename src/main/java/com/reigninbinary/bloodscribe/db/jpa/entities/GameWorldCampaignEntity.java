package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the game_world_campaigns database table.
 * 
 */
@Entity
@Table(name="game_world_campaigns")
@NamedQuery(name="GameWorldCampaignEntity.findAll", query="SELECT g FROM GameWorldCampaignEntity g")
public class GameWorldCampaignEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="game_world_campaign_id")
	private int gameWorldCampaignId;

	@Column(name="campaign_id")
	private int campaignId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	@Column(name="game_world_id")
	private int gameWorldId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public GameWorldCampaignEntity() {
	}

	public int getGameWorldCampaignId() {
		return this.gameWorldCampaignId;
	}

	public void setGameWorldCampaignId(int gameWorldCampaignId) {
		this.gameWorldCampaignId = gameWorldCampaignId;
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

	public int getGameWorldId() {
		return this.gameWorldId;
	}

	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}