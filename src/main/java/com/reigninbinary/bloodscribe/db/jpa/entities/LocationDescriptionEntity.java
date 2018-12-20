package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the location_descriptions database table.
 * 
 */
@Entity
@Table(name="location_descriptions")
@NamedQuery(name="LocationDescriptionEntity.findAll", query="SELECT l FROM LocationDescriptionEntity l")
public class LocationDescriptionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="description_id")
	private int descriptionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="location_id")
	private int locationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	private String visible;

	public LocationDescriptionEntity() {
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

	public String getDeescription() {
		return this.description;
	}

	public void setDeescription(String deescription) {
		this.description = deescription;
	}

	public int getLocationId() {
		return this.locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
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