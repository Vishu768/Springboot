package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Book {

	
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	
	private String title;
	private String author;
	private String category;
	private int bookid;
}
