package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the game_world_locations database table.
 * 
 */
@Entity
@Table(name="game_world_locations")
@NamedQuery(name="GameWorldLocationEntity.findAll", query="SELECT g FROM GameWorldLocationEntity g")
public class GameWorldLocationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="location_id")
	private int locationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="game_world_id")
	private int gameWorldId;

	private String location;

	@Column(name="parent_location_id")
	private int parentLocationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	private String visible;

	//uni-directional many-to-one association to GameWorldLocationType
	@ManyToOne
	@JoinColumn(name="location_type_id")
	private GameWorldLocationTypeEntity gameWorldLocationType;

	public GameWorldLocationEntity() {
	}

	public int getLocationId() {
		return this.locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getParentLocationId() {
		return this.parentLocationId;
	}

	public void setParentLocationId(int parentLocationId) {
		this.parentLocationId = parentLocationId;
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

	public GameWorldLocationTypeEntity getGameWorldLocationType() {
		return this.gameWorldLocationType;
	}

	public void setGameWorldLocationType(GameWorldLocationTypeEntity gameWorldLocationType) {
		this.gameWorldLocationType = gameWorldLocationType;
	}

}