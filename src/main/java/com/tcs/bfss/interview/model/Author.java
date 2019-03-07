package com.tcs.bfss.interview.model;

public class Author {
	
	public enum Country {
		USA("United States"),
		UK("United Kinkdom"),
		FR("France"),
		DE("Germany");
		
		private String name;
		
		Country(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}
	
	private String name;
	private int age;
	private Country country;
	
	public Author(String name, int age, Country country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Author{" + "name= '" + name + "' , country= '" + country.getName() + "'}";
	}
}
