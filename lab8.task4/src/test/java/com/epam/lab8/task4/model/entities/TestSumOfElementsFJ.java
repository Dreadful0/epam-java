package com.epam.lab8.task4.model.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.epam.lab8.task4.controllers.InputController;

public class TestSumOfElementsFJ {

	private static InputController input;
	private int[] data;
	
	public TestSumOfElementsFJ() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		input = new InputController();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		data = new int[100];
		input.fillData(data);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSum() {
		long sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		assertEquals(sum, new SumOfElementsFJ(data, 8).getSum());
	}

}
