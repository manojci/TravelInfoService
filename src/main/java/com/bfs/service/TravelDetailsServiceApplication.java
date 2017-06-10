package com.bfs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfs.service.entity.Fare;
import com.bfs.service.entity.Flight;
import com.bfs.service.entity.Route;
import com.bfs.service.repository.FaresRepository;
import com.bfs.service.repository.FlightRepository;
import com.bfs.service.repository.RouteRepository;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class TravelDetailsServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(TravelDetailsServiceApplication.class);
	
	@Autowired
	RouteRepository routeRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	FaresRepository faresRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TravelDetailsServiceApplication.class);
		log.info("Spring Boot Started");
	}

	@RequestMapping(value = "/v1/trip/travel-details", method = RequestMethod.GET)
    public List<Flight> request(@QueryParam("origin") String origin, @QueryParam("destination") String destination, @QueryParam("fromDate") Date fromDate) {
		List<Flight> flights= new ArrayList<Flight>();
		Route route= routeRepository.findByOriginAndDestination(origin, destination);
		flights = flightRepository.findByRouteIdAndActiveFlag(route.getId(),"Y");
        return flights;
    }
	@Bean
	public CommandLineRunner demo(FlightRepository FlightRepository,RouteRepository routeRepository,FaresRepository faresRepository) {
		return (args) -> {
			routeRepository.save(new Route(1L,"Chennai","Madurai",new Date(),new Date(),new Date(),null));
			routeRepository.save(new Route(2L,"Madurai","Chennai",new Date(),new Date(),new Date(),null));
			// save a couple of flights
			faresRepository.save(new Fare(1L, 1, 1, new Date(), new Date(), 2500.00));
			faresRepository.save(new Fare(2L, 1, 2, new Date(), new Date(), 1900.00));
			faresRepository.save(new Fare(3L, 2, 1, new Date(), new Date(), 1700.00));
			faresRepository.save(new Fare(4L, 3, 2, new Date(), new Date(), 2700.00));
			faresRepository.save(new Fare(5L, 4, 2, new Date(), new Date(), 4900.00));
			faresRepository.save(new Fare(6L, 5, 2, new Date(), new Date(), 3800.00));
			FlightRepository.save(new Flight(1L,"1000","SpiceJet","SJ1000",new Date(),null,routeRepository.findById(1L),faresRepository.findByFlightIdAndRouteId(1,1),"Y"));
			FlightRepository.save(new Flight(2L,"1001","SpiceJet","SJ1001",new Date(),null,routeRepository.findById(1L),faresRepository.findByFlightIdAndRouteId(2,1),"Y"));
			FlightRepository.save(new Flight(3L,"1002","JetAirWays","JAW1002",new Date(),null,routeRepository.findById(2L),faresRepository.findByFlightIdAndRouteId(3,2),"Y"));
			FlightRepository.save(new Flight(4L,"1003","AirIndia","AI1003",new Date(),null,routeRepository.findById(2L),faresRepository.findByFlightIdAndRouteId(4,2),"Y"));
			FlightRepository.save(new Flight(5L,"1004","JetAirWays","JAW1004",new Date(),null,routeRepository.findById(1L),faresRepository.findByFlightIdAndRouteId(5,2),"Y"));
		};
	}
}



