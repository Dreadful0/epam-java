package com.epam.lab2.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Viacheslav Demianenko
 *
 */
public class BookContainer implements Serializable {

	private static final long serialVersionUID = -8180261591704494757L;
	
	private Book[] books;
	private int booksNumber;	
	
	public BookContainer() {
		books = new Book[100];
	}
	
	public BookContainer(int size){
		books = new Book[size];
	}
	
	public void addBook(Book book){
		try {
			books[booksNumber] = book;
			booksNumber ++;
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Can not add new book, container full");
		}
	}

	public int getBooksNumber() {
		return booksNumber;
	}
	
	public Book[] getBooks() {
		return Arrays.copyOf(books, booksNumber);
	}
	
	public Book[] getBooksByAuthor(String author){
		Book[] buffer = new Book[books.length];
		int resultLength = 0;
		for(int i=0;i<booksNumber;i++){
			if(books[i].getAuthor().equals(author)){
				buffer[resultLength++] = books[i];
			}
		}		
		return Arrays.copyOf(buffer, resultLength);
	}
	
	public Book[] getBooksByPublisher(String publisher){
		Book[] buffer = new Book[books.length];
		int resultLength = 0;
		for(int i=0;i<booksNumber;i++){
			if(books[i].getPublisher().equals(publisher)){
				buffer[resultLength++] = books[i];
			}
		}		
		return Arrays.copyOf(buffer, resultLength);	
	}
	
	public Book[] getBooksByYear(Integer from, Integer to){
		if(from == null || to == null) return new Book[0];
		Book[] buffer = new Book[books.length];
		int resultLength = 0;
		for(int i=0;i<booksNumber;i++){
			if(books[i].getYear()>from && books[i].getYear()<to){
				buffer[resultLength++] = books[i];
			}
		}		
		return Arrays.copyOf(buffer, resultLength);	
	}
	
	public Book[] getBooksSortedByPublisher(){
		Book[] result = Arrays.copyOf(books, booksNumber);
		Arrays.sort(result, new Comparator<Book>() {

			public int compare(Book arg0, Book arg1) {
				return arg0.getPublisher().compareTo(arg1.getPublisher());
			}
		});
		return result;
	}
}
