package com.nandini.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nandini.springdatajpa.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

	Book findByBookid(Integer bookid);
	List<Book> findByGenre(String genre);
	List<Book> findByAuthor(String author);
	List<Book> findByPriceBetween(float minPrice, float maxPrice);
	List<Book> findByPagesLessThan(int pages);
	List<Book> findByPublicationyear(int publicationyear);
	List<Book> findByGenreAndLanguage(String genre, String language);
}
