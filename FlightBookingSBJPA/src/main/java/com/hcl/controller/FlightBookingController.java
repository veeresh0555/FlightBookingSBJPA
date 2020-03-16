package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.FlightDetails;
import com.hcl.request.FltdetailRequest;
import com.hcl.service.FlightService;

@RestController
public class FlightBookingController {

	
	@Autowired
	FlightService fltservice;
	
	/*
	 * @GetMapping("/getflightsearch") public ResponseEntity<List<FlightDetails>>
	 * flightSearch(FlightDetails fltdetails){
	 * 
	 * 
	 * List<FlightDetails> fltlist =fltservice.getflightsearch(fltdetails);
	 * 
	 * 
	 * return new ResponseEntity<List<FlightDetails>>(fltlist,HttpStatus.OK); }
	 */
	
	
	@PostMapping("/fltsave")
	public ResponseEntity<FlightDetails> flightsave(@Valid @RequestBody FltdetailRequest fltdetails){
		
		
		FlightDetails fltdetsave=fltservice.flightsave(fltdetails);
		
		
		return new ResponseEntity<FlightDetails>(fltdetsave,HttpStatus.OK);
	}
	
	
	
	
}
