package com.example.sec.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="city")
public class City {

	@Id
	@GeneratedValue
    @NotNull
    @Column
	private int id;
	
    @NotNull
    @Column
	private String city;
    
    public City() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
    
}
