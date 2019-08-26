package com.example.sec.model.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sec.model.*;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
	List<Author> findByName(String name);
}
