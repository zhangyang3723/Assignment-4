package assignment4_yangzhang;

import org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/*This Junit test is to test the method splitwords() used in Class ReverseWord CapitalizeFirstLetter and ThreeMoreLetters
 * thus splitwords() is a reusable method
 * 
 * */
public class SplitWordsTest {

	@Test
	public void test1() {
		ThreeMoreLetters test = new ThreeMoreLetters();
		ArrayList<String> x = new ArrayList(Arrays.asList("Have", "a", "good", "day"));
		String a = "Have a good day";
		Assert.assertEquals(x, test.splitWords(a));
	}
	
	@Test
	public void test2() {
		ThreeMoreLetters test = new ThreeMoreLetters();
		ArrayList<String> x = new ArrayList(Arrays.asList("Eat", "an", "apple", "a", "day"));
		String a = "Eat an apple a day";
		Assert.assertEquals(x, test.splitWords(a));
	}

}
