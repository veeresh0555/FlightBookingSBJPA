package com.hcl.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.FlightDetails;
import com.hcl.repository.FlightDetRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDetRepository fdrepository;
	
	
	@Override
	public List<FlightDetails> getflightsearch(FlightDetails fltdetails) {
		
		return fdrepository.findAllByparams(fltdetails.getSource(),fltdetails.getDestination(),fltdetails.getFlighttime());
	}//(fltdetails.getSource(),fltdetails.getDestination(),fltdetails.getFlighttime());


	@Override
	public FlightDetails flightsave(@Valid FlightDetails fltdetails) {
		FlightDetails fltsave=new FlightDetails();
		try {
			fltdetails.setFlighttime(new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01"));
			fltsave=fdrepository.save(fltdetails);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fltsave;
		
	}

}
