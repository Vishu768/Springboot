package com.example.demo;

public class Movie {
	public Movie(String name, Integer releaseYear, String actor) {
		this.name=name;
		this.releaseYear=releaseYear;
		this.actor=actor;
	}
	private String name;
	private Integer releaseYear;
	private String actor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	

}
