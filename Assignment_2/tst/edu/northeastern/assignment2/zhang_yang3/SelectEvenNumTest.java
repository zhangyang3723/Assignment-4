package edu.northeastern.assignment2.zhang_yang3;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectEvenNumTest {
    private SelectEvenNum test;
	
	@Before
	public void setUp() throws Exception {
		test = new SelectEvenNum();
	}

	@Test
	public void test() {
	int[] a1 = {2,4,6};
	int[] actual1 = test.displayEvenNum(7);
	Assert.assertArrayEquals(a1, actual1);
	
	int[] a2 = {2,4,6,8,10,12,14,16,18,20,22};	
	int[] actual2 = test.displayEvenNum(23);
	Assert.assertArrayEquals(a2, actual2);

	}

}
