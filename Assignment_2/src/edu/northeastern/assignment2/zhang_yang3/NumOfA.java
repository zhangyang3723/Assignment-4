package edu.northeastern.assignment2.zhang_yang3;

import java.util.Scanner;

public class NumOfA {

	public int count(String a) {
		int count = 0;
		char[] c = a.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a') {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("please enter a String:");
		String text = input.nextLine();
		input.close();

		NumOfA a = new NumOfA();
		
		System.out.println(text + " has " + a.count(text) + " 'a' (s).");

	}

}
