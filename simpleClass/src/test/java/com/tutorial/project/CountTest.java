package com.tutorial.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CountTest extends TestCase {

	public CountTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(CountTest.class);
	}

	public void testCount() {
		Count c1 = new Count("");
		assertTrue(c1.getCount() == 0);
		Count c2 = new Count("a");
		assertTrue(c2.getCount() == 1);
		Count c3 = new Count("aa");
		assertTrue(c3.getCount() == 1);
		Count c4 = new Count("aabbccddeefghij");
		assertTrue(c4.getCount() == 10);
		Count c5 = new Count(" ");
		assertTrue(c5.getCount() == 1);
		Count c6 = new Count("  ");
		assertTrue(c6.getCount() == 1);
	}

}
