package assignment4_yangzhang;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	static int generateRamdomNum(){
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(100);
        return i;
	}
	
	boolean guess(int userGuess, int target, int count){
		int v = 5-count; 
		if(userGuess > target){
			System.out.println(userGuess+" is greater than what I've guessed - You have "+v+" chances to guess");
			return false;
		}
		else if(userGuess < target){
			System.out.println(userGuess+" is less than what I've guessed - You have "+v+" chances to guess");
			return false;
		}
		else{
			System.out.println("Congratulations! You've guessed it right and you guessed it in "+count+" chances.");
			return true;
		}
	}

	public static void main(String[] args) {
		GuessGame test = new GuessGame();
		int a = generateRamdomNum();
	//	System.out.println(a);
		Scanner input = new Scanner(System.in);
		int count = 0;
		while(count<=5){
			if (count==5){
				System.out.println("The number is "+a);
				System.out.println("You fail.");
				break;
			}
			count++;
			System.out.println("please enter a number:");
			int number = input.nextInt();
			if(test.guess(number,a,count)==true){
				break;
			}
		}
		input.close();
	}

}
