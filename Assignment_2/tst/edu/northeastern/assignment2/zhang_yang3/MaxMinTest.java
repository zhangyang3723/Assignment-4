package edu.northeastern.assignment2.zhang_yang3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxMinTest {
	private MaxMin test;
	
	@Before
	public void init() {
		test = new MaxMin();
	}
	
	@Test
	public void test() {
		int[] a ={2,5,6,7,8};
		Assert.assertEquals(8, test.seleMax(a));
		Assert.assertEquals(2, test.seleMin(a));
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullPointerException() {
		int[] a = null;
		test.seleMax(a);
	}

}
