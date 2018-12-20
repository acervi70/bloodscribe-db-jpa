package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the game_worlds database table.
 * 
 */
@Entity
@Table(name="game_worlds")
@NamedQuery(name="GameWorldEntity.findAll", query="SELECT g FROM GameWorldEntity g")
public class GameWorldEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="game_world_id")
	private int gameWorldId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="game_world")
	private String gameWorld;

	@Column(name="read_only")
	private String readOnly;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public GameWorldEntity() {
	}

	public int getGameWorldId() {
		return this.gameWorldId;
	}

	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
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

	public String getGameWorld() {
		return this.gameWorld;
	}

	public void setGameWorld(String gameWorld) {
		this.gameWorld = gameWorld;
	}

	public String getReadOnly() {
		return this.readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}