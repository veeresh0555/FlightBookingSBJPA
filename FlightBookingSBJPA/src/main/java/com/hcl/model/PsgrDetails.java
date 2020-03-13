package com.hcl.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "psgrdetails")
public class PsgrDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	private String pname;
	private String gender;
	
	@OneToMany(mappedBy = "psgdet",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<FlightBooking> fltid;


	public long getPid() {
		return pid;
	}


	public void setPid(long pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	
	
	
	
	
}
