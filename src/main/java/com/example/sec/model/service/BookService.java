package com.example.sec.model.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sec.model.*;
import com.example.sec.model.repository.AuthorRepository;
import com.example.sec.model.repository.BookRepository;
import com.example.sec.model.repository.BookStoreRepository;
import com.example.sec.model.repository.CategoryRepository;
import com.example.sec.model.repository.CityRepository;
import com.example.sec.model.repository.PriceRepository;

@org.springframework.stereotype.Service
public class BookService {

	@Autowired
	CityRepository cityRepository;
	@Autowired 
	CategoryRepository categoryRepository;
	@Autowired
	PriceRepository priceRepository;
	@Autowired
	BookRepository bookRepository;
	@Autowired 
	BookStoreRepository bookStoreRepository;
	@Autowired
	AuthorRepository authorRepository;
	
	public BookService() {
		
	}

	//get all
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public List<City> getAllCity(){
		return cityRepository.findAll();
	}
	
	public List<Price> getAllPrice(){
		return priceRepository.findAll();
	}
	
	public List<Author> getAllAuthor(){
		return authorRepository.findAll();
	}
	
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	public List<BookStore> getAllBookstore(){
		return bookStoreRepository.findAll();
	}
	
	//get by
	public List<Category> findByCategory(String category){
		return this.categoryRepository.findByCategory(category);
	}
	
	public List<City> findByCity(String city){
		return this.cityRepository.findByCity(city);
	}
	
	public List<Author> findByAuthorName(String name){
		return this.authorRepository.findByName(name);
	}
	
	public List<Price> findByPrice(String price){
		return this.priceRepository.findByPrice(price);
	}
	
	public List<Price> findByCurrency(String currency){
		return this.priceRepository.findByCurrency(currency);
	}
	
	public List<Book> findByBookName(String name){
		return this.bookRepository.findByName(name);
	}
	
	public List<BookStore> findByBookStoreName(String name){
		return this.bookStoreRepository.findByName(name);
	}
	
	
	//create
	public Category createNewCategory(Category category) {
		return this.categoryRepository.save(category);
	}
	
	public City createNewCity(City city) {
		return this.cityRepository.save(city);
	}
	
	public Author createNewAuthor(Author author) {
		return this.authorRepository.save(author);
	}
	
	public Price createNewPrice(Price price) {
		return this.priceRepository.save(price);
	}
	
	public Book createNewBook(Book book) {
		return this.bookRepository.save(book);
	}
	
	public BookStore createNewBookStore(BookStore bookStore) {
		return this.bookStoreRepository.save(bookStore);
	}
	
	//delete
	
	
	

	
}
