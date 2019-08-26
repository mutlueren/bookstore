package com.example.sec.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="price")
public class Price {

	@Id
	@GeneratedValue
    @NotNull
    @Column
	private int id;
	
    @NotNull
    @Column
	private int price;
 
    @NotNull
    @Column    
    private String currency;
    
    public Price() {
    	
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	@OneToOne
    private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
    
	
}
