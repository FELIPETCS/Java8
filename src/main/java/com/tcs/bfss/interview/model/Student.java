package com.tcs.bfss.interview.model;

import java.util.List;

public class Student extends Author{

	private List<Book> books;
	
	public Student(String name, int age, Country country, List<Book> book) {
		super(name, age, country);
		this.books = book;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> book) {
		this.books = book;
	}
	
	@Override
	public String toString() {
		return "Student{" + "name= '" + getName() +"' , age= "+ getAge()+  " , country= '" + getCountry().getName() + "'}";
	}
}
