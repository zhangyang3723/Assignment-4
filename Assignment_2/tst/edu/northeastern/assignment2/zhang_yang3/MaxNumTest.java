package edu.northeastern.assignment2.zhang_yang3;

import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;


public class MaxNumTest {

	@Test
	public void test() {
		MaxNum test = new MaxNum();
		int[] a ={2,5,6,7,8};
		Assert.assertEquals(8, test.seleMax(a));
		
		int[] b ={2,5,6,7,8,45,89,2,200};
		Assert.assertEquals(200, test.seleMax(b));
	}

}
