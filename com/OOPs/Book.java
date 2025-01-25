package com.OOPs;

public class Book {
	private String title;
	private int price;
	
	Book(){
		System.out.println("default constructor");
		title = "Unknown Title";
		price =0;
	}
	Book(String title){
		this();
		this.title = title;
		price = 100;
		System.out.println("one parameterized constructor");
	}
	Book(String title,int p){
		this(title);
		this.price = p;
		System.out.println("two parameterized constructor");
	}
}
