package com.it1311l.uap.oneflightapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.it1311l.uap.oneflightapp.model.AmadeusAirlineResponse;

@Mapper
public interface AirlinesRepository {
	@Insert("INSERT INTO airline_location(airline_code, location, iata_code) VALUES (#{airlineCode}, #{name}, #{iataCode})")
	public int insertAirlineLoc(String airlineCode, String name, String iataCode);
	
	@Select("SELECT airline_code FROM airline_location")
    List<AmadeusAirlineResponse> getAllAirlineCodes();

    @Select("SELECT location FROM airline_location")
    List<AmadeusAirlineResponse> getAllLocations();
}
