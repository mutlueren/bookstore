package com.example.sec.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue
    @NotNull
    @Column
	private int id;
	
    @NotNull
    @Column	
	private String category;
    
    public Category() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
    
}
