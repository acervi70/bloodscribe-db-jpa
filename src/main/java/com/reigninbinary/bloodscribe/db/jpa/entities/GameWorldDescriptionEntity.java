package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the game_world_descriptions database table.
 * 
 */
@Entity
@Table(name="game_world_descriptions")
@NamedQuery(name="GameWorldDescriptionEntity.findAll", query="SELECT g FROM GameWorldDescriptionEntity g")
public class GameWorldDescriptionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="description_id")
	private int descriptionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="game_world_id")
	private int gameWorldId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	private String visible;

	public GameWorldDescriptionEntity() {
	}

	public int getDescriptionId() {
		return this.descriptionId;
	}

	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
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