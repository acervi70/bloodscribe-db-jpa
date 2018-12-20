package com.reigninbinary.bloodscribe.db.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the location_timeline database table.
 * 
 */
@Entity
@Table(name="location_timeline")
@NamedQuery(name="LocationTimelineEntity.findAll", query="SELECT l FROM LocationTimelineEntity l")
public class LocationTimelineEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="timeline_id")
	private int timelineId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt")
	private Date createdDt;

	private String description;

	@Column(name="event_date")
	private String eventDate;

	@Column(name="event_order")
	private int eventOrder;

	@Column(name="location_id")
	private int locationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_dt")
	private Date updatedDt;

	public LocationTimelineEntity() {
	}

	public int getTimelineId() {
		return this.timelineId;
	}

	public void setTimelineId(int timelineId) {
		this.timelineId = timelineId;
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

	public String getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public int getEventOrder() {
		return this.eventOrder;
	}

	public void setEventOrder(int eventOrder) {
		this.eventOrder = eventOrder;
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

}