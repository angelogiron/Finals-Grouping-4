package com.it1311l.uap.oneflightapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface AirlinesRepository {
	@Insert("INSERT INTO airline_location(airline_code, location, iata_code) VALUES (#{airlineCode}, #{name}, #{iataCode})")
	public int insertAirlineLoc(String airlineCode, String name, String iataCode);
	
	@Select("SELECT DISTINCT airline_code FROM airline_location")
    public List<String> getAllAirlineCodes();

    @Select("SELECT DISTINCT iata_code FROM airline_location ORDER BY iata_code")
    public List<String> getAllLocations();
    
    @Update("TRUNCATE TABLE airline_location")
    public void truncateAirlineLocations();
}
