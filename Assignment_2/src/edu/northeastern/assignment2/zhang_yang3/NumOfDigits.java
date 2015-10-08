package edu.northeastern.assignment2.zhang_yang3;
import java.util.Scanner;

public class NumOfDigits {


	public int count(int a){
		char[] c = String.valueOf(a).toCharArray();
		//System.out.println(a+" has "+ c.length+ " digit(s).");
		return  c.length;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		int number = input.nextInt();
		input.close();
		
		NumOfDigits a = new NumOfDigits();
		System.out.println(number+" has "+ a.count(number)+ " digit(s).");
		
	}

}
