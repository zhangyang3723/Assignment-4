package edu.northeastern.assignment2.zhang_yang3;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeTesterTest {
    
	private PrimeTester test;
	
	@Before
	public void setUp() throws Exception {
		test = new PrimeTester();
	}
    
	@Test
	public void testIsPrime() {
	 boolean b = test.isPrime(32);
	 Assert.assertFalse(b);
	 b = test.isPrime(33);
	 Assert.assertFalse(b);
	 b = test.isPrime(11);
	 Assert.assertTrue(b);
	}
}
