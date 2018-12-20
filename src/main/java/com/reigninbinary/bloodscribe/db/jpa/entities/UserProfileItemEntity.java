package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_profile_items database table.
 * 
 */
@Entity
@Table(name="user_profile_items")
@NamedQuery(name="UserProfileItemEntity.findAll", query="SELECT u FROM UserProfileItemEntity u")
public class UserProfileItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	@Column(name="item_value")
	private String itemValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	@Column(name="user_id")
	private int userId;

	//uni-directional many-to-one association to UserProfileItemType
	@ManyToOne
	@JoinColumn(name="item_type_id")
	private UserProfileItemTypeEntity userProfileItemType;

	public UserProfileItemEntity() {
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getItemValue() {
		return this.itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserProfileItemTypeEntity getUserProfileItemType() {
		return this.userProfileItemType;
	}

	public void setUserProfileItemType(UserProfileItemTypeEntity userProfileItemType) {
		this.userProfileItemType = userProfileItemType;
	}

}