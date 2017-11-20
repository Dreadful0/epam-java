package com.epam.lab2.view;

import java.io.IOException;

import com.epam.lab2.model.Book;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	public Output() {
	}
	
	public void printMainManu(){
		System.out.println(IInfo.MainMenuTitle);
		System.out.println(IInfo.GetBooksByAuthorNumber+IInfo.GetBooksByAuthorString);
		System.out.println(IInfo.GetBooksByPublisherNumber+IInfo.GetBooksByPublisherString);
		System.out.println(IInfo.GetBooksPublishedAfterNumber+IInfo.GetBooksPublishedAfterString);
		System.out.println(IInfo.SortBooksByPublisherNumber+IInfo.SortBooksByPublisherString);
		System.out.println(IInfo.ExitNumber+IInfo.ExitString);
	}
	
	public void printSubMenu(){
		System.out.println(IInfo.SubMenuTitle);
		System.out.println(IInfo.BackString);
		System.out.println(IInfo.ExitNumber+IInfo.ExitString);
	}
	
	public void clearOut(){
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public void printBooks(Book[] books){
		if(books.length == 0){
			System.out.println(IInfo.NoDataString);
			return;
		}
		System.out.println(IInfo.Delimeter);
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println(IInfo.Delimeter);
	}
	
	public void printString(String str){
		System.out.println(str);
	}
}
