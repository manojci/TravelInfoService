package com.bfs.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bfs.service.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long> {

    Flight findById(Long Id);
    
    List<Flight> findByRouteIdAndActiveFlag(Long routeId,String activeFlag);
}
