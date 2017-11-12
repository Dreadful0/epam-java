package com.epam.lab2.back;

import junit.framework.TestCase;

/**
 * @author Viacheslav Demianenko
 *
 */
public class BookContainerTest extends TestCase {

	public BookContainerTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBookContainerConstructor() {
		BookContainer container = new BookContainer();

		assertNotNull(container);
		assertEquals(0, container.getBooksNumber());

		BookContainer container2 = new BookContainer(100);
		assertNotNull(container2.getBooks());
		assertEquals(0, container2.getBooksNumber());
	}

	public void testAddBook() {
		BookContainer container = new BookContainer(100);
		Book book1 = new Book("1984", "George Orwell", "Amazing Reads", 2014,
				310, 98.0);

		assertEquals(0, container.getBooks().length);

		container.addBook(book1);
		assertEquals(1, container.getBooks().length);
		assertEquals(1, container.getBooksNumber());
		assertEquals(book1,container.getBooks()[container.getBooksNumber() - 1]);
	}

	public void testGetBooksByAuthor() {
		BookContainer container = new BookContainer(100);
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
		
		assertEquals(4, container.getBooksByAuthor("J.K. Rowling").length);
		assertEquals(book4, container.getBooksByAuthor("J.K. Rowling")[0]);
	}
	
	public void testGetBooksSortedByPublisher(){
		BookContainer container = new BookContainer(100);
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
		
		Book[] sorted = container.getBooksSortedByPublisher();
		assertEquals(7, sorted.length);
		assertEquals("Amazing Reads", sorted[0].getPublisher());
		assertEquals("Penguin", sorted[6].getPublisher());
	}
}
