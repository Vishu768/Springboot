package com.example.demo.service;

import java.util.List;

public interface BookService {
	Book getbyId(int bookid);
	List<Book> getBooksByAuthor(String author);
	List<Book> getBooksByCategory(String Category);

}



