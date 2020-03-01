package com.example.sec.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sec.model.*;
import com.example.sec.repository.AuthorRepository;
import com.example.sec.repository.BookRepository;
import com.example.sec.repository.BookStoreRepository;
import com.example.sec.repository.CategoryRepository;
import com.example.sec.repository.CityRepository;
import com.example.sec.repository.PriceRepository;

import javax.transaction.Transactional;

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

	@Transactional
	public void manualBookStoreGenerator() {
		try {
			Category category = new Category();
			category.setCategory("Drama");
			createNewCategory(category);

			City city = new City();
			city.setCity("Istanbul");
			createNewCity(city);

			Price price = new Price();
			price.setPrice(25);
			price.setCurrency("TL");
			price.setCity(city);
			createNewPrice(price);

			Author oguzAtay = new Author();
			oguzAtay.setName("Oguz Atay");
			createNewAuthor(oguzAtay);

			Book tutunamayanlar = new Book();
			tutunamayanlar.setName("Tutunamayanlar");
			tutunamayanlar.setAuthor(oguzAtay);
			tutunamayanlar.setPrice(price);
			tutunamayanlar.setCategory(category);
			createNewBook(tutunamayanlar);

			BookStore kitapci = new BookStore();
			kitapci.setName("Tarihi Eminonu Kitapcisi");
			List<Book> books = new ArrayList<Book>();
			books.add(tutunamayanlar);
			kitapci.setBooks(books);
			createNewBookStore(kitapci);

		}catch (Exception e){
			e.getMessage();
		}
	}

	/*get all*/
	@Transactional
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}

	@Transactional
	public List<City> getAllCity(){
		return cityRepository.findAll();
	}

	@Transactional
	public List<Price> getAllPrice(){
		return priceRepository.findAll();
	}

	@Transactional
	public List<Author> getAllAuthor(){
		return authorRepository.findAll();
	}

	@Transactional
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}

	@Transactional
	public List<BookStore> getAllBookstore(){
		return bookStoreRepository.findAll();
	}
	
	/*get by*/
	@Transactional
	public List<Category> findByCategory(String category){
		return this.categoryRepository.findByCategory(category);
	}

	@Transactional
	public List<City> findByCity(String city){
		return this.cityRepository.findByCity(city);
	}

	@Transactional
	public List<Author> findByAuthorName(String name){
		return this.authorRepository.findByName(name);
	}

	@Transactional
	public List<Price> findByPrice(String price){
		return this.priceRepository.findByPrice(price);
	}

	@Transactional
	public List<Price> findByCurrency(String currency){
		return this.priceRepository.findByCurrency(currency);
	}

	@Transactional
	public List<Book> findByBookName(String name){
		return this.bookRepository.findByName(name);
	}

	@Transactional
	public List<BookStore> findByBookStoreName(String name){
		return this.bookStoreRepository.findByName(name);
	}
	
	
	/*create new*/
	@Transactional
	public Category createNewCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Transactional
	public City createNewCity(City city) {
		return this.cityRepository.save(city);
	}

	@Transactional
	public Author createNewAuthor(Author author) {
		return this.authorRepository.save(author);
	}

	@Transactional
	public Price createNewPrice(Price price) {
		return this.priceRepository.save(price);
	}

	@Transactional
	public Book createNewBook(Book book) {
		return this.bookRepository.save(book);
	}

	@Transactional
	public BookStore createNewBookStore(BookStore bookStore) {
		return this.bookStoreRepository.save(bookStore);
	}

	/*update*/
	@Transactional
	public Category updateCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Transactional
	public City updateCity(City city) {
		return this.cityRepository.save(city);
	}

	@Transactional
	public Author updateAuthor(Author author) {
		return this.authorRepository.save(author);
	}

	@Transactional
	public Price updatePrice(Price price) {
		return this.priceRepository.save(price);
	}

	@Transactional
	public Book updateBook(Book book) {
		return this.bookRepository.save(book);
	}

	@Transactional
	public BookStore updateBookStore(BookStore bookStore) {
		return this.bookStoreRepository.save(bookStore);
	}
	
	/*delete*/
	@Transactional
	public boolean deleteCategory(Integer id){
		try {
			categoryRepository.deleteById(id);
			return true;
		}catch (Exception e){
			System.out.println("Error catched: "+e.getMessage());
			return false;
		}
	}

	@Transactional
	public boolean deleteCity(Integer id){
		try {
			cityRepository.deleteById(id);
			return true;
		}catch (Exception e){
			System.out.println("Error catched: "+e.getMessage());
			return false;
		}
	}

	@Transactional
	public boolean deleteAuthor(Integer id){
		try {
			authorRepository.deleteById(id);
			return true;
		}catch (Exception e){
			System.out.println("Error catched: "+e.getMessage());
			return false;
		}
	}

	@Transactional
	public boolean deletePrice(Integer id){
		try {
			priceRepository.deleteById(id);
			return true;
		}catch (Exception e){
			System.out.println("Error catched: "+e.getMessage());
			return false;
		}
	}

	@Transactional
	public boolean deleteBook(Integer id){
		try {
			bookRepository.deleteById(id);
			return true;
		}catch (Exception e){
			System.out.println("Error catched: "+e.getMessage());
			return false;
		}
	}

	@Transactional
	public boolean deleteBookStore(Integer id){
		try {
			bookStoreRepository.deleteById(id);
			return true;
		}catch (Exception e){
			System.out.println("Error catched: "+e.getMessage());
			return false;
		}
	}

}
