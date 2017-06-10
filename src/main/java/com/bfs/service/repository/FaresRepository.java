package com.bfs.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.bfs.service.entity.Fare;

public interface FaresRepository extends CrudRepository<Fare, Long> {
	
    Fare findByFlightIdAndRouteId(int flightId, int routeId);
}