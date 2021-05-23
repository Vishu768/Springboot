package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
	//TODO Auto-generated method stub

	
	    List<Movie> movieList= Arrays.asList(new Movie("M1",2021,"A1"),
	    		(new Movie("M2",2020,"A2")));;
	/*Stream<Movie> moviesStream = movieList.stream();
	 
	Stream<Movie> filterStream = moviesStream.filter(m -> m.getReleaseYear() == 2021);
	// maP - to get specific element or to map to any other object
	Stream<String> mapStream = filterStream.map(Movie::getName);
	
	mapStream.forEach(System.out::println);*/
	    		movieList.stream()
	    		          .filter(m->m.getReleaseYear()==2021)
	    		          .map(Movie::getName)
	    		          .forEach(System.out::println); // terminal
	   
}
}
