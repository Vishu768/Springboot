package com.example.demo.service;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;


@Service

public class BookServiceImpl implements BookService {

	@Override
	public Book getbyId(int bookid) {
		// TODO Auto-generated method stub
		return getBookList();
		       .Stream()
               .findAny()
		       .filter((book)->getBookid()==bookid)
               .orElse(new Book());
	}

	@Override
	public List<Book> getBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return getBookList();
	       .Stream()
	       .filter((book)->getAuthor().equals(author))
           .collect(Collectors.toList());
	}

	@Override
	public List<Book> getBooksByCategory(String Category) {
		// TODO Auto-generated method stub
		return getBookList();
	       .Stream()
	       .filter((book)->getCategory().equals(Category))
        .collect(Collectors.toList());
	}
	private List<Book> getBookList(){
		return Arrays.asList(new Book("Java","Kathy","Tech",10),
				new Book("Spring","Rod","Tech",11),
				new Book("Miracle","Kathy","Fiction",12),
				new Book("Ferrari","Robin","Fiction",13),
				new Book("Captain","Hal","Comedy",14),
				new Book("Skull Glow","Kumaran","Horror",15));
	}

	