package com.hcl.request;

public class FltdetailRequest {
	
	private long fid;
	private String airline;
	private String source;
	private String destination;
	private String flighttime;
	private long paireamt;
	private long seats;
	

	public long getSeats() {
		return seats;
	}

	public void setSeats(long seats) {
		this.seats = seats;
	}

	public long getFid() {
		return fid;
	}

	public void setFid(long fid) {
		this.fid = fid;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	

	public String getFlighttime() {
		return flighttime;
	}

	public void setFlighttime(String flighttime) {
		this.flighttime = flighttime;
	}

	public long getPaireamt() {
		return paireamt;
	}

	public void setPaireamt(long paireamt) {
		this.paireamt = paireamt;
	}

	
	
	
}
