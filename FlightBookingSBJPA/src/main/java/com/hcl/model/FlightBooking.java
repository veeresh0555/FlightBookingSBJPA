package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="flightbooking")
public class FlightBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fbid;
	
	private String mealstatus;
	
	/*
	 * @Column(name="bkgdt")
	 * 
	 * @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	 * 
	 * @Temporal(TemporalType.DATE) private Date bookingdt;
	 */
	
	@Column(name="bkgdt")
	private String bookingdt;
	
	@OneToOne
	@JoinColumn(name = "flightid")
	private FlightDetails fltid;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "psgrid", nullable = false)
	private PsgrDetails psgdet;
	
	public long getFbid() {
		return fbid;
	}

	
	public PsgrDetails getPsgdet() {
		return psgdet;
	}


	public void setPsgdet(PsgrDetails psgdet) {
		this.psgdet = psgdet;
	}


	public void setFbid(long fbid) {
		this.fbid = fbid;
	}

	public String getMealstatus() {
		return mealstatus;
	}

	public void setMealstatus(String mealstatus) {
		this.mealstatus = mealstatus;
	}

	public String getBookingdt() {
		return bookingdt;
	}


	public void setBookingdt(String bookingdt) {
		this.bookingdt = bookingdt;
	}


	public FlightDetails getFltid() {
		return fltid;
	}

	public void setFltid(FlightDetails fltid) {
		this.fltid = fltid;
	}

	
	
	
	
	
	
}
