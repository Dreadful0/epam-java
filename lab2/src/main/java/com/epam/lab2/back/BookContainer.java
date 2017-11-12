package com.epam.lab2.back;

public class BookContainer {

	private Book[] books;
	private int booksNumber;	
	
	public BookContainer() {
	}
	
	public BookContainer(int size){
		books = new Book[size];
	}

	public BookContainer(Book[] books, int booksNumber) {
		this.books = books;
		this.booksNumber = booksNumber;
	}
	
	public void addBook(Book book){
		books[booksNumber] = book;
		booksNumber ++;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int getBooksNumber() {
		return booksNumber;
	}

	public void setBooksNumber(int booksNumber) {
		this.booksNumber = booksNumber;
	}
	
}
