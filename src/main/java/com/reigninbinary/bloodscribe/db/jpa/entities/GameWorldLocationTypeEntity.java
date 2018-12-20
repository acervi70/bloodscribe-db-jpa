package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the game_world_location_types database table.
 * 
 */
@Entity
@Table(name="game_world_location_types")
@NamedQuery(name="GameWorldLocationTypeEntity.findAll", query="SELECT g FROM GameWorldLocationTypeEntity g")
public class GameWorldLocationTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="location_type_id")
	private int locationTypeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="game_world_id")
	private int gameWorldId;

	@Column(name="location_type")
	private String locationType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public GameWorldLocationTypeEntity() {
	}

	public int getLocationTypeId() {
		return this.locationTypeId;
	}

	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
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

	public int getGameWorldId() {
		return this.gameWorldId;
	}

	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
	}

	public String getLocationType() {
		return this.locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}