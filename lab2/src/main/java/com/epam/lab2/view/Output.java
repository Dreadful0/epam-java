package com.epam.lab2.view;

import java.io.IOException;

import com.epam.lab2.model.Book;
import static com.epam.lab2.view.IInfo.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class Output {

	public Output() {
	}
	
	public void printMainManu(){
		System.out.println(MainMenuTitle);
		System.out.println(GetBooksByAuthorNumber+GetBooksByAuthorString);
		System.out.println(GetBooksByPublisherNumber+GetBooksByPublisherString);
		System.out.println(GetBooksPublishedAfterNumber+GetBooksPublishedAfterString);
		System.out.println(SortBooksByPublisherNumber+SortBooksByPublisherString);
		System.out.println(WriteFileNumber+WriteFileString);
		System.out.println(ReadFileNumber+ReadFileString);
		System.out.println(ExitNumber+ExitString);
	}
	
	public void printSubMenu(){
		System.out.println(SubMenuTitle);
		System.out.println(BackString);
		System.out.println(ExitNumber+ExitString);
	}
	
	public void clearOut(){
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public void printBooks(Book[] books){
		if(books.length == 0){
			System.out.println(NoDataString);
			return;
		}
		System.out.println(Delimeter);
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println(Delimeter);
	}
	
	public void printString(String str){
		System.out.println(str);
	}
}
