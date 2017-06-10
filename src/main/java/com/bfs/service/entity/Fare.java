package com.bfs.service.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fare {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private int flightId;
    private int routeId;
    private Date createdDate;
    private Date updatedDate;
    private Double price;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fares [id=" + id + ", flightId=" + flightId + ", routeId=" + routeId + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", price=" + price + "]";
	}
	public Fare(Long id, int flightId, int routeId, Date createdDate, Date updatedDate, Double price) {
		super();
		this.id = id;
		this.flightId = flightId;
		this.routeId = routeId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.price = price;
	}
    protected Fare() {}
}
