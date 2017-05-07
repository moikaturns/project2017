package com.tutorial.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SimpleIT extends TestCase {

	public SimpleIT(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(SimpleIT.class);
	}

	public void testSimpleIT() {
		System.out.println("simple integration test");
		assertTrue(true);
	}

	public void testSimpleIT2() {
		System.out.println("simple integration test 2");
		assertTrue(true);
	}

}
