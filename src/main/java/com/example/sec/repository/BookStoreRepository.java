package com.example.sec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sec.model.*;

public interface BookStoreRepository extends JpaRepository<BookStore, Integer>{
	List<BookStore> findByName(String name);
}
