package com.example.sec.model;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="store")
public class BookStore {

	@Id
	@GeneratedValue
    @NotNull
    @Column
	private int id;
	
    @NotNull
    @Column
	private String name;
	
	@ManyToMany
	private List<Book> books;

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

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	
}
