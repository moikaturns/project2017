package com.tutorial.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SimpleUnit extends TestCase {

	public SimpleUnit(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(SimpleUnit.class);
	}

	public void testSimpleUnit() {
		System.out.println("simple unit test");
		assertTrue(true);
	}

	public void testSimpleUnit2() {
		System.out.println("simple unit test 2");
		assertTrue(true);
	}

}
