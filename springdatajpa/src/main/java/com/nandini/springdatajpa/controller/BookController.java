package com.nandini.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nandini.springdatajpa.entities.Book;
import com.nandini.springdatajpa.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}

	@GetMapping("return")
	public String returnback() {
		return "index.jsp";
	}

	@GetMapping("back")
	public String back() {
		return "BookOperations.jsp";
	}

	@GetMapping("backto")
	public String backto() {
		return "MemberOperations.jsp";
	}

	@GetMapping("bookOperations")
	public String OperationsOnBook() {
		return "BookOperations.jsp";
	}

	@GetMapping("memberOperations")
	public String OperationsOnMember() {
		return "MemberOperations.jsp";
	}

	@GetMapping("addbook")
	public String AddBook() {
		return "NewBook.jsp";
	}

	@PostMapping("addnewbook")
	public String addNewBook(Book book) {
		bookService.addNewBook(book);
		return "Success.jsp";
	}

	@GetMapping("searchbooks")
	public String searchBook() {
		return "SearchBooks.jsp";
	}

	@PostMapping("searchBookid")
	public ModelAndView searchBookId(int bookid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnBookId.jsp");
		Book book = bookService.getBookByBookid(bookid);
		mv.addObject("book", book);
		return mv;
	}

	@PostMapping("searchBookgenre")
	public ModelAndView searchBookGenre(String genre) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnGenre.jsp");
		List<Book> list = bookService.getBookByGenre(genre);
		mv.addObject("lst", list);
		return mv;
	}

	@PostMapping("searchBookauthor")
	public ModelAndView searchBookAuthor(String author) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnAuthor.jsp");
		List<Book> list = bookService.getBookByAuthor(author);
		mv.addObject("lst", list);
		return mv;
	}

	@PostMapping("searchBookBtnRange")
	public ModelAndView searchBookBtnRange(float minPrice, float maxPrice) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnPriceRange.jsp");
		List<Book> list = bookService.getBookByPrice(minPrice, maxPrice);
		mv.addObject("lst", list);
		return mv;
	}

	@PostMapping("searchBookGenreNdLang")
	public ModelAndView searchBookGenreNdLang(String genre, String language) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnGenreNdLang.jsp");
		List<Book> list = bookService.getBookByGenreNdLang(genre, language);
		mv.addObject("lst", list);
		return mv;
	}

	@PostMapping("searchBookPagesLessThan")
	public ModelAndView searchBookOnPages(int pages) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnPages.jsp");
		List<Book> list = bookService.getBookByPagesLessThan(pages);
		mv.addObject("lst", list);
		return mv;
	}

	@PostMapping("searchBookPublicationYr")
	public ModelAndView searchBookPublicationYr(int publicationyear) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnYear.jsp");
		List<Book> list = bookService.getbookByPublicationYear(publicationyear);
		mv.addObject("lst", list);
		return mv;
	}

	@GetMapping("modifyprice")
	public String modifyPrice() {
		return "UpdatePrice.jsp";
	}

	@PostMapping("updatePrice")
	public String updatePrice(int bookid, float price) {
		bookService.updateBoookPrice(bookid, price);
		return "Success.jsp";
	}

	@GetMapping("deletebook")
	public String deleteBook() {
		return "DeleteForm.jsp";
	}

	@PostMapping("delBook")
	public String delBook(int bookid) {
		bookService.deleteBook(bookid);
		return "Success.jsp";
	}
}
