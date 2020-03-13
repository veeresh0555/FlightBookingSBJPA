package com.hcl.service;

import java.util.List;

import javax.validation.Valid;

import com.hcl.model.FlightDetails;

public interface FlightService {

	List<FlightDetails> getflightsearch(FlightDetails fltdetails);

	FlightDetails flightsave(@Valid FlightDetails fltdetails);


	
	
	
}
