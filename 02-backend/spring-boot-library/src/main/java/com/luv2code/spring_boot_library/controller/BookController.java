package com.luv2code.spring_boot_library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.spring_boot_library.entity.Book;
import com.luv2code.spring_boot_library.service.BookService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/books")
public class BookController {
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PutMapping("secure/checkout")
	public Book checkoutBook(@RequestParam Long bookId) throws Exception {
		String userEmail = "kevintestuser@email.com";
		Book book = bookService.checkoutBook(userEmail, bookId);
		
		return book;
	}
	
	@GetMapping("secure/currentloans/count")
	public int currentLoansCount() throws Exception {
		String userEmail = "kevintestuser@email.com";
		return bookService.currentLoansCount(userEmail);	
	}
	
	@GetMapping("secure/ischeckedout/byuser")
	public Boolean checkoutBookByUser(@RequestParam Long bookId) throws Exception {
		String userEmail = "kevintestuser@email.com";
		return bookService.checkoutBookByUser(userEmail, bookId);
	}
	
}
