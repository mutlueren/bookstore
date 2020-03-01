package com.example.sec.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.sec.model.*;
import com.example.sec.service.BookService;

@CrossOrigin(origins = "http://localhost:8000/")
@RestController
public class MainController {

	/* inject */
	@Autowired
	BookService service;

	/* generate datas by manual */
	@GetMapping("/generate")
	public void bookStoreGenerator() {
		service.manualBookStoreGenerator();
	}
	
	/*get*/
	@GetMapping("/getAllCategory")
	public List<Category> getAllCategory(){
		return service.getAllCategory();
	}
	
	@GetMapping("/getAllCity")
	public List<City> getAllCity(){
		return service.getAllCity();
	}
	
	@GetMapping("/getAllPrice")
	public List<Price> getAllPrice(){
		return service.getAllPrice();
	}
	
	@GetMapping("/getAllAuthor")
	public List<Author> getAllAuthor(){
		return service.getAllAuthor();
	}
	
	@GetMapping("/getAllBook")
	public List<Book> getAllBook(){
		return service.getAllBook();
	}
	
	@GetMapping("/getAllBookstore")
	public List<BookStore> getAllBookstore(){
		
		return service.getAllBookstore();
	}
	
	/*get by*/
	@PostMapping("/findByCategory")
	public List<Category> findByCategory(@RequestParam("category") String category){
		return service.findByCategory(category);
	}
	
	@PostMapping("/findByCity")
	public List<City> findByCity(@RequestParam("city") String city){
		return service.findByCity(city);
	}
	
	@PostMapping("/findByAuthorName")
	public List<Author> findByAuthorName(@RequestParam("name") String name){
		return service.findByAuthorName(name);
	}
	
	@PostMapping("/findByPrice")
	public List<Price> findByPrice(@RequestParam("price") String price){
		return service.findByPrice(price);
	}
	
	@PostMapping("/findByCurrency")
	public List<Price> findByCurrency(@RequestParam("currency") String currency){
		return service.findByCurrency(currency);
	}
	
	@PostMapping("/findByBookName")
	public List<Book> findByBookName(@RequestParam("name") String name){
		return service.findByBookName(name);
	}
	
	@PostMapping("/findByBookStoreName")
	public List<BookStore> findByBookStoreName(@RequestParam("name") String name){
		return service.findByBookStoreName(name);
	}
	
	/*create new*/
	@PostMapping("/createNewCategory")
	public Category createNewCategory(@RequestBody Category category) {
		return service.createNewCategory(category);
	}
	
	@PostMapping("/createNewCity")
	public City createNewCity(@RequestBody City city) {
		return service.createNewCity(city);
	}
	
	@PostMapping("/createNewAuthor")
	public Author createNewAuthor(@RequestBody Author author) {
		return service.createNewAuthor(author);
	}
	
	@PostMapping("/createNewPrice")
	public Price createNewPrice(@RequestBody Price price) {
		return service.createNewPrice(price);
	}
	
	@PostMapping("/createNewBook")
	public Book createNewBook(@RequestBody Book book) {
		return service.createNewBook(book);
	}
	
	@PostMapping("/createNewBookStore")
	public BookStore createNewBookStore(@RequestBody BookStore bookStore) {
		return service.createNewBookStore(bookStore);
	}
	
	/*update*/
	@PutMapping("/updateCategory")
	public Category updateCategory(@RequestBody Category category) {
		return service.updateCategory(category);
	}
	
	@PostMapping("/updateCity")
	public City updateCity(@RequestBody City city) {
		return service.updateCity(city);
	}
	
	@PostMapping("/updateAuthor")
	public Author updateAuthor(@RequestBody Author author) {
		return service.updateAuthor(author);
	}
	
	@PostMapping("/updatePrice")
	public Price updatePrice(@RequestBody Price price) {
		return service.updatePrice(price);
	}
	
	@PostMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
	@PostMapping("/updateBookStore")
	public BookStore updateBookStore(@RequestBody BookStore bookStore) {
		return service.updateBookStore(bookStore);
	}
	
	/*delete*/
    @DeleteMapping("/deleteCategory")
    public boolean deleteCategory(@PathVariable(value = "id") Integer id){
		if(service.deleteCategory(id)){
			return true;
		}else
			return false;
    }
    
    @DeleteMapping("/deleteCity")
    public boolean deleteCity(@PathVariable(value = "id") Integer id){
		if(service.deleteCity(id)){
			return true;
		}else
			return false;
    }
    
    @DeleteMapping("/deleteAuthor")
    public boolean deleteAuthor(@PathVariable(value = "id") Integer id){
		if(service.deleteAuthor(id)){
			return true;
		}else
			return false;
    }
    
    @DeleteMapping("/deletePrice")
    public boolean deletePrice(@PathVariable(value = "id") Integer id){
		if(service.deletePrice(id)){
			return true;
		}else
			return false;
    }
    
    @DeleteMapping("/deleteBook")
    public boolean deleteBook(@PathVariable(value = "id") Integer id){
        if(service.deleteBook(id)){
        	return true;
		}else
			return false;
    }
    
    @DeleteMapping("/deleteBookStore")
    public boolean deleteBookStore(@PathVariable(value = "id") Integer id){
		if(service.deleteBookStore(id)){
			return true;
		}else
			return false;
    }

}
