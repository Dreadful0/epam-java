package com.epam.lab3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.epam.lab3.back.TemperatureConverter;

@RunWith(value = Parameterized.class)
public class testTemperatureConverter {

	@Parameter(0)
	public double celsius;
	@Parameter(1)
	public double kelvin;
	@Parameter(2)
	public double fahrenheit;
	
	public static TemperatureConverter conv;
	
	@Parameters(name="Test C:{0}, K:{1}, F:{2}")
	public static Collection<Object[]> getTestData(){
		return Arrays.asList(new Object[][]{
				{0, 273.2, 32},
				{-17.78, 255.37, 0},
				{-273, 0.15, -459},
				{15, 288.15 , 59},
				{-26.11, 247.04, -15}
		});
	}
	
	public testTemperatureConverter() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conv = new TemperatureConverter();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		conv = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertFtoC() {
		assertEquals(celsius, conv.convertFtoC(fahrenheit), 0.5);
	}

	@Test
	public void testConvertCtoF() {
		assertEquals(fahrenheit, conv.convertCtoF(celsius), 0.5);
	}

	@Test
	public void testConvertCtoK() {
		assertEquals(kelvin, conv.convertCtoK(celsius), 0.5);
	}

	@Test
	public void testConvertKtoC() {
		assertEquals(celsius, conv.convertKtoC(kelvin), 0.5);
	}

	@Test
	public void testConvertFtoK() {
		assertEquals(kelvin, conv.convertFtoK(fahrenheit), 0.5);
	}

	@Test
	public void testConvertKtoF() {
		assertEquals(fahrenheit, conv.convertKtoF(kelvin), 0.5);
	}

}
