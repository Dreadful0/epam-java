package com.epam.labEnum;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyEnum {

	enum real {
		One, Two, Three
	}
	
	MyEnum numbers;
	
	public TestMyEnum() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		numbers = new MyEnum("One", "Two", "Three", "Four");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyEnum() {
		
		assertEquals(numbers.valueOf("Two").name(), real.valueOf("Two").name());
		assertEquals(numbers.values()[2].ordinal(), real.values()[2].ordinal());
	}

}
