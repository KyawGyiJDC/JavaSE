package com.solt.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.solt.jdc.Calculator;

public class CalculatorTest {
	private Calculator calcultor;
	@Before
	public void setUp() {
		calcultor = new Calculator();
	}
	
	@Test
	public void should_return_addition_when_two_number() throws Exception {
		assertEquals(5, calcultor.add(2,3));
		assertThat(calcultor.add(2,3),is(5));
	}
	@Test
	public void should_return_subtration_when_two_number() throws Exception {
		assertEquals(-1, calcultor.subtract(2,3));
		assertThat(calcultor.subtract(2,3),is(-1));
	}
}
