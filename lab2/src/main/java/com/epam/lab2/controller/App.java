package com.epam.lab2.controller;

import org.apache.log4j.Logger;

import com.epam.lab2.model.BookContainer;
import com.epam.lab2.view.*;

import static com.epam.lab2.view.IInfo.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class App {

	static Logger logger = Logger.getLogger(App.class);
	
	private static Input input;
	private static Output output;

	private Integer choosen = null;
	private BookContainer container;
	
	public App() {
		input = new Input();
		output = new Output();
		logger.debug("App constructor");
	}

	private void getBooksByAuthor(){
		String author = input.getTestAuthor();
		output.printString(author);
		if(container != null)output.printBooks(container.getBooksByAuthor(author));
		else output.printString(NoDataString);
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	private void getBooksByPublisher(){
		String publisher = input.getTestPublisher();
		output.printString(publisher);
		if(container != null)output.printBooks(container.getBooksByPublisher(publisher));
		else output.printString(NoDataString);
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	private void getBooksPublishedAfter(){
		int year = input.getTestYear();
		output.printString(""+year);
		if(container != null)output.printBooks(container.getBooksByYear(year,Integer.MAX_VALUE));
		else output.printString(NoDataString);
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	private void sortBooksByPublisher(){
		if(container != null)output.printBooks(container.getBooksSortedByPublisher());
		else output.printString(NoDataString);
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	private void mainMenuPreparation(){
		output.clearOut();
		if(container != null)output.printBooks(container.getBooks());
		else output.printString(NoDataString);
		output.printMainManu();
		choosen = input.readNumber();
		if(choosen == null){
			choosen = Integer.MAX_VALUE;
		}
	}
	
	private void writeFile(){
		if(input.fillTestData())output.printString(FileSaveSuccess);
		else output.printString(FileSaveFail);
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	private void readFile(){
		container = FileController.readFile(SAVE_DIRECTORY);
		if(container == null) output.printString(FileLoadFail);
		else output.printString(FileLoadSuccess);
		output.printSubMenu();
		choosen = input.readNumber();
	}
	
	public void doWork() {
		do {
			mainMenuPreparation();
			switch (choosen) {
			case GetBooksByAuthorNumber:
				getBooksByAuthor();
				break;
			case GetBooksByPublisherNumber:
				getBooksByPublisher();
				break;
			case GetBooksPublishedAfterNumber:
				getBooksPublishedAfter();
				break;
			case SortBooksByPublisherNumber:
				sortBooksByPublisher();
				break;
			case WriteFileNumber:
				writeFile();
				break;
			case ReadFileNumber:
				readFile();
				break;
			default:
				break;
			}
		} while (choosen!=ExitNumber);
	}

}
