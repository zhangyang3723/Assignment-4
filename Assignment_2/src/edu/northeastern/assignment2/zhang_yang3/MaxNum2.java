package edu.northeastern.assignment2.zhang_yang3;

import java.util.Scanner;
import java.util.ArrayList;

public class MaxNum2 {

	void seleMax(ArrayList<Integer> a) {
		// System.out.println("method start!");
		int max = a.get(0).intValue();
		int min = a.get(0).intValue();
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i).intValue() > max) {
				max = a.get(i).intValue();
			}
		}

		for (int j = 1; j < a.size(); j++) {
			if (a.get(j).intValue() < min) {
				min = a.get(j).intValue();
			}

		}
		System.out.println("Maximum: " + max + " Minimum: " + min);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("please enter a array");
		ArrayList<Integer> arr = new ArrayList<>();

		while (input.hasNextInt()) {
			int a = input.nextInt();
			Integer v = new Integer(a);
			arr.add(v);
			// System.out.print(a);
		}
		input.close();
		MaxNum2 test = new MaxNum2();
		test.seleMax(arr);
	}

}
