package com.hcl.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.model.FlightDetails;

@Repository
public interface FlightDetRepository extends JpaRepository<FlightDetails, Long>  {

	@Query("select fd from FlightDetails fd where fd.source=:source and fd.destination=:destination and fd.flighttime=:flighttime")
	List<FlightDetails> findAllByparams(@Param("source") String source,@Param("destination") String destination,@Param("flighttime") Date flighttime);


}
