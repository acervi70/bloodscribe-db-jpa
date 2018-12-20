package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_profile_item_types database table.
 * 
 */
@Entity
@Table(name="user_profile_item_types")
@NamedQuery(name="UserProfileItemTypeEntity.findAll", query="SELECT u FROM UserProfileItemTypeEntity u")
public class UserProfileItemTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_type_id")
	private int itemTypeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="item_type")
	private String itemType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public UserProfileItemTypeEntity() {
	}

	public int getItemTypeId() {
		return this.itemTypeId;
	}

	public void setItemTypeId(int itemTypeId) {
		this.itemTypeId = itemTypeId;
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

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}