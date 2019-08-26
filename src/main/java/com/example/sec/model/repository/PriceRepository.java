package com.example.sec.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sec.model.*;

public interface PriceRepository extends JpaRepository<Price, Integer>{
	List<Price> findByPrice(String price);
	List<Price> findByCurrency(String currency);
}
