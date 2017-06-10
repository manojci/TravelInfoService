package com.bfs.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.bfs.service.entity.Route;

public interface RouteRepository extends CrudRepository<Route, Long> {

    Route findById(Long Id);
    
    Route findByOriginAndDestination(String origin, String destination);
}
