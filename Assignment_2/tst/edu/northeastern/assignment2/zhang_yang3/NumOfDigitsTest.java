package edu.northeastern.assignment2.zhang_yang3;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NumOfDigitsTest {
	
	private NumOfDigits test;

	@Before
	public void setUp() throws Exception {
		test = new NumOfDigits();
	}

	@Test
	public void test() {
		Assert.assertEquals(4, test.count(1234));
		Assert.assertEquals(7, test.count(1234567));
		Assert.assertEquals(1, test.count(0));
	}
	

}
