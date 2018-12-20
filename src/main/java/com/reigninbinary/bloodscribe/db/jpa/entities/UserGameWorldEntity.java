package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_game_worlds database table.
 * 
 */
@Entity
@Table(name="user_game_worlds")
@NamedQuery(name="UserGameWorldEntity.findAll", query="SELECT u FROM UserGameWorldEntity u")
public class UserGameWorldEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_game_world_id")
	private int userGameWorldId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	//uni-directional many-to-one association to GameWorld
	@ManyToOne
	@JoinColumn(name="game_world_id")
	private GameWorldEntity gameWorld;

	//uni-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;

	public UserGameWorldEntity() {
	}

	public int getUserGameWorldId() {
		return this.userGameWorldId;
	}

	public void setUserGameWorldId(int userGameWorldId) {
		this.userGameWorldId = userGameWorldId;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public GameWorldEntity getGameWorld() {
		return this.gameWorld;
	}

	public void setGameWorld(GameWorldEntity gameWorld) {
		this.gameWorld = gameWorld;
	}

	public UserEntity getUser() {
		return this.user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}