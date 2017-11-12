package com.epam.lab2.front;

import java.io.IOException;

import com.epam.lab2.back.Book;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	public Output() {
	}
	
	public void printMainManu(){
		System.out.println("---Main menu---");
		System.out.println("1) Get books by author");
		System.out.println("2) Get books by publisher");
		System.out.println("3) Get books that was published after some year");
		System.out.println("4) Sort books by publisher");
		System.out.println("5) Close program");
	}
	
	public void printSubMenu(){
		System.out.println("---Sub menu---");
		System.out.println("Any number) Back");
		System.out.println("5) Close program");
	}
	
	public void clearOut(){
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public void printBooks(Book[] books){
		if(books.length == 0){
			System.out.println("data is empty");
			return;
		}
		System.out.println("-------------------------------------------");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("-------------------------------------------");
	}
	
	public void printString(String str){
		System.out.println(str);
	}
}
