package com.hcl.service;

import javax.validation.Valid;

import com.hcl.model.FlightDetails;
import com.hcl.request.FltdetailRequest;

public interface FlightService {

	//List<FlightDetails> getflightsearch(FlightDetails fltdetails);

	FlightDetails flightsave(@Valid FltdetailRequest fltdetails);


	
	
	
}
