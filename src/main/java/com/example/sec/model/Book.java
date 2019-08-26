package com.example.sec.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue
    @NotNull
    @Column
	private int id;
	
    @NotNull
    @Column
	private String name;	
    
    @OneToOne
    private Category category;
    
    @OneToOne
    private Price price;
    
    @OneToOne
    private Author author;

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}


}
