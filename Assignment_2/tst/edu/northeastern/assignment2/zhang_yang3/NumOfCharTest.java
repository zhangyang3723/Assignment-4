package edu.northeastern.assignment2.zhang_yang3;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class NumOfCharTest {

	@Test
	public void test() {
		NumOfChar test = new NumOfChar();
	
		Assert.assertEquals(2, test.count("absdfa", 'a'));
		Assert.assertEquals(3, test.count("absdfaa", 'a'));
	}

}
