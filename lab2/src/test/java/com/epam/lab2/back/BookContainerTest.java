package com.epam.lab2.back;

import junit.framework.TestCase;

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

	public void testBookContainerConstructor(){
		BookContainer container = new BookContainer();
		
		assertNull(container.getBooks());
		assertNotNull(container);
		assertEquals(0, container.getBooksNumber());
		
		BookContainer container2 = new BookContainer(100);
		assertNotNull(container2.getBooks());
		assertEquals(0, container2.getBooksNumber());
	}
	
	public void testAddBook(){
		BookContainer container = new BookContainer(100);
		Book book1 = new Book("1984","George Orwell","Amazing Reads",2014,310,98.0);
		
		assertNull(container.getBooks()[container.getBooksNumber()]);
		
		container.addBook(book1);
		assertNotNull(container.getBooks()[container.getBooksNumber()-1]);
		assertEquals(1, container.getBooksNumber());
		assertEquals(book1, container.getBooks()[container.getBooksNumber()-1]);
	}
}
