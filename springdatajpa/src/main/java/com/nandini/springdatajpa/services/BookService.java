package com.nandini.springdatajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandini.springdatajpa.entities.Book;
import com.nandini.springdatajpa.repositories.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public Book addNewBook(Book book) {
		return bookRepo.save(book);
	}

	public Book getBookByBookid(int bookid) {
		Book book = bookRepo.findByBookid(bookid);
		if (book != null) {
			System.out.println("Book title of " + bookid + " is : " + book.getTitle());
		} else {
			book = new Book();
			book.setBookid(0);
			book.setAuthor("Not found");
			book.setDescription("Not found");
			book.setGenre("Not found");
			book.setIsbn("Not found");
			book.setLanguage("Not found");
			book.setPages(0);
			book.setPrice(0);
			book.setPublicationyear(0);
			book.setPublisher("Not found");
			book.setTitle("Not found");
		}
		return book;
	}

	public List<Book> getBookByGenre(String genre) {
		List<Book> lst = bookRepo.findByGenre(genre);
		return lst;
	}

	public List<Book> getBookByAuthor(String author) {
		List<Book> lst = bookRepo.findByAuthor(author);
		return lst;
	}

	public List<Book> getBookByPrice(float minPrice, float maxPrice) {
		List<Book> lst = bookRepo.findByPriceBetween(minPrice, maxPrice);
		return lst;
	}

	public List<Book> getBookByGenreNdLang(String genre, String language) {
		List<Book> lst = bookRepo.findByGenreAndLanguage(genre, language);
		return lst;
	}

	public List<Book> getBookByPagesLessThan(int pages) {
		List<Book> lst = bookRepo.findByPagesLessThan(pages);
		return lst;
	}

	public List<Book> getbookByPublicationYear(int publicationyear) {
		List<Book> lst = bookRepo.findByPublicationyear(publicationyear);
		return lst;
	}

	public Book updateBoookPrice(int bookid, float price) {
		Book obj = bookRepo.findByBookid(bookid);
		obj.setPrice(price);
		return bookRepo.save(obj);
	}

	public Book deleteBook(int bookid) {
		Book book = bookRepo.findByBookid(bookid);
		bookRepo.delete(book);
		return book;
	}
}
