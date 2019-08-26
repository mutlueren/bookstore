package com.example.sec.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sec.model.*;

public interface CityRepository extends JpaRepository<City, Integer>{
	List<City> findByCity(String city);
}
