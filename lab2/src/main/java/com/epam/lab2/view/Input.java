package com.epam.lab2.view;

import java.util.Random;
import java.util.Scanner;

import com.epam.lab2.model.Book;
import com.epam.lab2.model.BookContainer;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Input {

	private final static String[] testAuthors = {"George Orwell", "J.K. Rowling", "Michio Kaku"};
	private final static String[] testPublishers = {"Amazing Reads", "Penguin", "Bloomsbury Press", "Ababagalamaga"};
	
	public Input() {
	}
	
	public void fillTestData(BookContainer container){
		Book book1 = new Book("1984", "George Orwell", "Amazing Reads", 2014,
				310, 98.0);
		Book book2 = new Book("Animal Farm", "George Orwell", "Penguin", 2011,
				104, 68.0);
		Book book3 = new Book("Why I Write", "George Orwell", "Penguin", 2004,
				128, 175.5);
		Book book4 = new Book("Harry Potter and the Philosopher's Stone",
				"J.K. Rowling", "Bloomsbury Press", 2000, 352, 207.0);
		Book book5 = new Book("Harry Potter and the Chamber of Secrets",
				"J.K. Rowling", "Bloomsbury Press", 2001, 256, 243.0);
		Book book6 = new Book("Harry Potter and the Prisoner of Azkaban",
				"J.K. Rowling", "Bloomsbury Press", 2001, 320, 171.0);
		Book book7 = new Book("Harry Potter and the Goblet of Fire",
				"J.K. Rowling", "Bloomsbury Press", 2003, 638, 419.0);
		container.addBook(book1);
		container.addBook(book2);
		container.addBook(book3);
		container.addBook(book4);
		container.addBook(book5);
		container.addBook(book6);
		container.addBook(book7);
	}
	
	public Integer readNumber() {
		System.out.println("Please input the number:");
		Scanner in = new Scanner(System.in);
		Integer number = null;
		try {
			number = in.nextInt();
		} catch (Exception e) {
			System.err.println("Invalid input");
		}
		return number;
	}
	
	public String readString() {
		System.out.println("Please input the string:");
		Scanner in = new Scanner(System.in);
		String str = null;
		try {
			str = in.nextLine();
		} catch (Exception e) {
			System.err.println("Invalid input");
		}
		return str;
	}
	
	public String getTestAuthor(){
		Random rn = new Random();
		return testAuthors[rn.nextInt(3)];
	}
	
	public String getTestPublisher(){
		Random rn = new Random();
		return testPublishers[rn.nextInt(4)];
	}
	
	public int getTestYear(){
		Random rn = new Random();
		return rn.nextInt(15)+2000;
	}
}
