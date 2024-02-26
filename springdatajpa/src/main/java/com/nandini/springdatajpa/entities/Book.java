package com.nandini.springdatajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	private int bookid;
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int publicationyear;
	private String genre;
	private String description;
	private int pages;
	private float price;
	private String language;

	public Book() {
		super();
	}

	public Book(int bookid, String isbn, String title, String author, String publisher, int publicationyear,
			String genre, String description, int pages, float price, String language) {
		super();
		this.bookid = bookid;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationyear = publicationyear;
		this.genre = genre;
		this.description = description;
		this.pages = pages;
		this.price = price;
		this.language = language;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublicationyear() {
		return publicationyear;
	}

	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
