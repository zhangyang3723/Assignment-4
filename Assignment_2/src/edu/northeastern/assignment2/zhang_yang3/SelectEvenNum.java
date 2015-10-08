package edu.northeastern.assignment2.zhang_yang3;
import java.util.Arrays;
import java.util.Scanner;

public class SelectEvenNum {
	public int[] displayEvenNum(int a){
	int[] b = new int[a/2];
	    
	for(int i=0;i<a/2;i++){
		b[i]=2*i+2;
	}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		int number = input.nextInt();
		input.close();
		
		SelectEvenNum test = new SelectEvenNum();
		System.out.println(Arrays.toString(test.displayEvenNum(number)));
		
	}

}
