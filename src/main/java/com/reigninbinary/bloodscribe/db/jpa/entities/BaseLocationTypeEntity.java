package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the base_location_types database table.
 * 
 */
@Entity
@Table(name="base_location_types")
@NamedQuery(name="BaseLocationTypeEntity.findAll", query="SELECT b FROM BaseLocationTypeEntity b")
public class BaseLocationTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="location_type_id")
	private int locationTypeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="location_type")
	private String locationType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public BaseLocationTypeEntity() {
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