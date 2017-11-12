package com.epam.lab2.back;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public BookTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testHashCode() {
		Book book1 = new Book("1984","George Orwell","Amazing Reads",2014,310,98.0);
		Book book2 = new Book("1984","George Orwell","Amazing Reads",2014,310,98.0);
		Book book3 = new Book("1985","George Orwell","Amazing Reads",2014,310,98.0);
		
		assertEquals(book1.hashCode(), book2.hashCode());
		assertNotSame(book1.hashCode(), book3.hashCode());
	}

	public void testEqualsObject() {
		Book book1 = new Book("1984","George Orwell","Amazing Reads",2014,310,98.0);
		Book book2 = new Book("1984","George Orwell","Amazing Reads",2014,310,98.0);
		Book book3 = new Book("1985","George Orwell","Amazing Reads",2014,310,98.0);
		Book book4 = book2;
		
		assertTrue(book1.equals(book2));
		assertTrue(book2.equals(book1));
		assertTrue(book4.equals(book2));
		assertFalse(book1.equals(book3));
	}

}
