package com.hcl.service;

import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.FlightDetails;
import com.hcl.repository.FlightDetRepository;
import com.hcl.request.FltdetailRequest;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDetRepository fdrepository;
	
	
	/*
	 * @Override public List<FlightDetails> getflightsearch(FlightDetails
	 * fltdetails) {
	 * 
	 * 
	 * 
	 * 
	 * return
	 * fdrepository.findAllByparams(fltdetails.getSource(),fltdetails.getDestination
	 * (),fltdetails.getFlighttime()); }
	 */


	@Override
	public FlightDetails flightsave(@Valid FltdetailRequest fltdetails) {
		FlightDetails fdet=new FlightDetails();
		
		java.util.Date sdate = null;
		try {
			
			fdet.setFid(fltdetails.getFid());
			fdet.setAirline(fltdetails.getAirline());
			fdet.setSource(fltdetails.getSource());
			fdet.setDestination(fltdetails.getDestination());
			fdet.setPaireamt(fltdetails.getPaireamt());
			fdet.setSeats(fltdetails.getSeats());
			String strfdate=fltdetails.getFlighttime();
			sdate = new SimpleDateFormat("dd-MM-yyyy").parse(strfdate);
			fdet.setFlighttime(sdate);
			fdet=fdrepository.save(fdet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fdet;
		
	}

}
