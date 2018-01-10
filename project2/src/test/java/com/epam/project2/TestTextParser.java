package com.epam.project2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.epam.project2.model.entities.Sentence;
import com.epam.project2.model.entities.Text;
import com.epam.project2.service.TextParser;

public class TestTextParser {

	public TestTextParser() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParseText() {
		Text text = TextParser.parseText("\tHello, my name is Dr. Black!.. 'This is a test' text. ");
		System.out.println(text);
	}

	@Test
	public void testParseSentence() {
		Sentence sentence = TextParser.parseSentence(" Hello, my name-is Dr!? Drew!.. ");
		System.out.println(sentence);
	}

}
