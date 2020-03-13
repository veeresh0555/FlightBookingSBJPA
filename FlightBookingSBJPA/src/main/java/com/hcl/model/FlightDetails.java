package com.hcl.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "flightdetails")
public class FlightDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fid;
	private String airline;
	private String source;
	private String destination;
	
	@Column(name = "availSeats")
	private long seats;
	
	/*
	 * @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss") private Timestamp flighttime;
	 */
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date flighttime;
	
	@Column(name="pairamount")
	private long paireamt;
	
	@OneToOne(mappedBy = "fltid")//fltid
	private FlightBooking fltbooking;

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

	public long getSeats() {
		return seats;
	}

	public void setSeats(long seats) {
		this.seats = seats;
	}

	

	public Date getFlighttime() {
		return flighttime;
	}

	public void setFlighttime(Date flighttime) {
		this.flighttime = flighttime;
	}

	public long getPaireamt() {
		return paireamt;
	}

	public void setPaireamt(long paireamt) {
		this.paireamt = paireamt;
	}

	public FlightBooking getFltbooking() {
		return fltbooking;
	}

	public void setFltbooking(FlightBooking fltbooking) {
		this.fltbooking = fltbooking;
	}
	
	
	
	
	
	
	
	
	
	
}
