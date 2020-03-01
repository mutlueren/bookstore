package com.example.sec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sec.model.*;

public interface BookRepository extends JpaRepository<Book, Integer>{
	List<Book> findByName(String name);
}
