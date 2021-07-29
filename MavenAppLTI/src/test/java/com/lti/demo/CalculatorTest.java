package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void Add1() {
		Calculator calc = new Calculator();
		int res = calc.add(10, 30);
		assertEquals(40, res);
	}
	
	
	
	@Test
	public void Mul1() {
		Calculator calc = new Calculator();
		int res = calc.mul(10, 30);
		assertEquals(300, res);
	}

}
