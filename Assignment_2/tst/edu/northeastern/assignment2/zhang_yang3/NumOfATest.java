package edu.northeastern.assignment2.zhang_yang3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NumOfATest {
	
	private NumOfA test;

	@Before
	public void setUp() throws Exception {
		test = new NumOfA();
	}

	@Test
	public void test() {
		Assert.assertEquals(4, test.count("aaasda"));
		Assert.assertEquals(6, test.count("aaasdasadfa"));
	}

}
