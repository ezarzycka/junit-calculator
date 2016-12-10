package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {

	private Calculator classUnderTest;

	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}

	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}

	@Test
	public void testSumMethod() throws Exception {

		double a = 4.0;
		double b = 7.0;

		double result = classUnderTest.sum(a, b);

		assertEquals(11.0, result, 0.001);
	}

	@Test
	public void testS() throws Exception {

		double a = 11.0;
		double b = 2.0;

		double result = classUnderTest.subtract(a, b);

		assertEquals(9.0, result, 0.001);

	}

	@Test
	public void testMulti() throws Exception {

		double a = 3;
		double b = 5;

		double result = classUnderTest.multiply(a, b);

		assertEquals(15, result, 0.001);

	}

	@Test
	public void testDiv() throws Exception {

		double a = 100;
		double b = 10;

		double result = classUnderTest.divide(a, b);

		assertEquals(10, result, 0.001);

	}

	@Test(expected = IllegalArgumentException.class)

	public void testDivByZero() throws Exception {

		double a = 100;
		double b = 0;

		classUnderTest.divide(a, b);

	}

}
