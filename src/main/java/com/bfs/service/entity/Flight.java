package com.bfs.service.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Flight {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
		private String flightNumber;
        private String flightName;
        private String flightCode;
        private Date createdDate;
        private Date updatedDate;
        @OneToOne
        private Route route;
		@OneToOne
        private Fare fare;
        private String activeFlag;
        
        public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getFlightName() {
			return flightName;
		}

		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}

		public String getFlightCode() {
			return flightCode;
		}

		public void setFlightCode(String flightCode) {
			this.flightCode = flightCode;
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

		public Route getRoute() {
			return route;
		}

		public void setRoute(Route route) {
			this.route = route;
		}

		public Fare getFare() {
			return fare;
		}

		public void setFare(Fare fare) {
			this.fare = fare;
		}

		public String getActiveFlag() {
			return activeFlag;
		}

		public void setActiveFlag(String activeFlag) {
			this.activeFlag = activeFlag;
		}

		public Flight(Long id, String flightNumber, String flightName, String flightCode, Date createdDate,
				Date updatedDate, Route route, Fare fare, String activeFlag) {
			super();
			this.id = id;
			this.flightNumber = flightNumber;
			this.flightName = flightName;
			this.flightCode = flightCode;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
			this.route = route;
			this.fare = fare;
			this.activeFlag = activeFlag;
		}

		protected Flight() {}
}
