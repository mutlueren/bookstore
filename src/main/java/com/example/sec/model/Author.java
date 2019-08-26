package com.example.sec.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue
    @NotNull
    @Column
	private int id;
	
    @NotNull
    @Column
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
