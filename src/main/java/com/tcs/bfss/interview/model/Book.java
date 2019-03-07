package com.tcs.bfss.interview.model;

import java.time.LocalDate;

public class Book {
	
	public enum Category{
		HISTORY, MEDICAL, TECHNOLOGY
	}

	private String title;
	private LocalDate date;
	private int price;
	private Category category;
	private Author author;
	
	public Book(String title, LocalDate date, int price, Category category, Author author) {
		this.title = title;
		this.date = date;
		this.price = price;
		this.category = category;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book{" + "price= " + price + " , date= " + date.getMonth()+"-"+ date.getYear()+
				" title= '" + title + 
				"' , " + author + '}';
	}
}
