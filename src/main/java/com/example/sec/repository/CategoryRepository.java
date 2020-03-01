package com.example.sec.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sec.model.*;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	List<Category> findByCategory(String category);
}
