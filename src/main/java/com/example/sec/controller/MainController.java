package com.example.sec.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.sec.model.*;
import com.example.sec.model.repository.AuthorRepository;
import com.example.sec.model.repository.BookRepository;
import com.example.sec.model.repository.BookStoreRepository;
import com.example.sec.model.repository.CategoryRepository;
import com.example.sec.model.repository.CityRepository;
import com.example.sec.model.repository.PriceRepository;
import com.example.sec.model.service.BookService;

@CrossOrigin(origins = "http://localhost:8000/")
@RestController
public class MainController {

	@Autowired
	BookService service;
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
	
	@GetMapping("/")
	public String bookGenerator() {
		Category category = new Category();
		category.setCategory("Adventure");
		this.categoryRepository.save(category);
		
		City city = new City();
		city.setCity("Istanbul");
		this.cityRepository.save(city);
		
		Price price = new Price();
		price.setPrice(25);
		price.setCurrency("TL");
		price.setCity(city);
		this.priceRepository.save(price);
		
		Author oguzAtay = new Author();
		oguzAtay.setName("Oguz Atay");
		this.authorRepository.save(oguzAtay);
		
		Book tutunamayanlar = new Book();
		tutunamayanlar.setName("Tutunamayanlar");
		tutunamayanlar.setAuthor(oguzAtay);
		tutunamayanlar.setPrice(price);
		tutunamayanlar.setCategory(category);
		this.bookRepository.save(tutunamayanlar);
		
        BookStore kitapci = new BookStore();
        kitapci.setName("Eminonu Kitapcisi");
        List<Book> books = new ArrayList<Book>();
        books.add(tutunamayanlar);
        kitapci.setBooks(books);
        this.bookStoreRepository.save(kitapci);
		
		return "Book Store have generated.";
	}
	
	//get
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
	
	//get by
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
	
	//create
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
	
	//update
	@PutMapping("/updateCategory")
	public Category updateCategory(@RequestBody Category category) {
		return service.createNewCategory(category);
	}
	
	@PostMapping("/updateCity")
	public City updateCity(@RequestBody City city) {
		return service.createNewCity(city);
	}
	
	@PostMapping("/updateAuthor")
	public Author updateAuthor(@RequestBody Author author) {
		return service.createNewAuthor(author);
	}
	
	@PostMapping("/updatePrice")
	public Price updatePrice(@RequestBody Price price) {
		return service.createNewPrice(price);
	}
	
	@PostMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return service.createNewBook(book);
	}
	
	@PostMapping("/updateBookStore")
	public BookStore updateBookStore(@RequestBody BookStore bookStore) {
		return service.createNewBookStore(bookStore);
	}
	
	//delete
    @DeleteMapping("/deleteCategory")
    public boolean deleteCategory(@PathVariable(value = "id") Integer id){
        categoryRepository.deleteById(id);
        return true;
    }
    
    @DeleteMapping("/deleteCity")
    public boolean deleteCity(@PathVariable(value = "id") Integer id){
        cityRepository.deleteById(id);
        return true;
    }
    
    @DeleteMapping("/deleteAuthor")
    public boolean deleteAuthor(@PathVariable(value = "id") Integer id){
        authorRepository.deleteById(id);
        return true;
    }
    
    @DeleteMapping("/deletePrice")
    public boolean deletePrice(@PathVariable(value = "id") Integer id){
        priceRepository.deleteById(id);
        return true;
    }
    
    @DeleteMapping("/deleteBook")
    public boolean deleteBook(@PathVariable(value = "id") Integer id){
        bookRepository.deleteById(id);
        return true;
    }
    
    @DeleteMapping("/deleteBookStore")
    public boolean deleteBookStore(@PathVariable(value = "id") Integer id){
        bookStoreRepository.deleteById(id);
        return true;
    }

}
