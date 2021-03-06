package com.bfs.service.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String origin;
    private String destination;
    private Date createdDate;
    private Date updatedDate;
    private String activeFlag;

    protected Route() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Route(Long id, String origin, String destination, Date createdDate, Date updatedDate, String activeFlag) {
		super();
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.activeFlag = activeFlag;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", origin=" + origin + ", destination=" + destination + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + ", activeFlag=" + activeFlag + "]";
	}
}
