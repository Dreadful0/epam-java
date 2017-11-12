package com.epam.lab2.back;

import com.epam.lab2.front.*;

/**
 * @author Viacheslav Demianenko
 *
 */
public class App {

	private static Input input;
	private static Output output;

	public App() {
		input = new Input();
		output = new Output();
	}

	public void doWork() {
		BookContainer container = new BookContainer(20);
		input.fillTestData(container);
		Integer choosen = null;
		do {
			output.clearOut();
			output.printBooks(container.getBooks());
			output.printMainManu();
			choosen = input.readNumber();
			if(choosen == null){
				choosen = 0;
				continue;
			}
			switch (choosen) {
			case 1:
				String author = input.getTestAuthor();
				output.printString(author);
				output.printBooks(container.getBooksByAuthor(author));
				output.printSubMenu();
				choosen = input.readNumber();
				break;
			case 2:
				String publisher = input.getTestPublisher();
				output.printString(publisher);
				output.printBooks(container.getBooksByPublisher(publisher));
				output.printSubMenu();
				choosen = input.readNumber();
				break;
			case 3:
				int year = input.getTestYear();
				output.printString(""+year);
				output.printBooks(container.getBooksByYear(year,Integer.MAX_VALUE));
				output.printSubMenu();
				choosen = input.readNumber();
				break;
			case 4:
				output.printBooks(container.getBooksSortedByPublisher());
				output.printSubMenu();
				choosen = input.readNumber();
				break;
			default:
				break;
			}
		} while (choosen!=5);
	}

}
