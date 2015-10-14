package assignment4_yangzhang;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
	
	static int[] generateRamdomNonRepeatedNum(){
		Random randomGenerator = new Random();
        int[] randomArr = new int[4]; 		
        randomArr[3] = randomGenerator.nextInt(10);
        do{
			randomArr[2] = randomGenerator.nextInt(10);
		}
		while(randomArr[2]==randomArr[3]);
		do{
			randomArr[1] = randomGenerator.nextInt(10);
		}
		while(randomArr[1] == randomArr[3] || randomArr[1] == randomArr[2]);
		do{
			randomArr[0] = randomGenerator.nextInt(10);
		}
		while(randomArr[0] == randomArr[3] || randomArr[0] == randomArr[2] || randomArr[0] == randomArr[1]);
		return randomArr;
	}
	
	int countBull(int[] guessArr, int[] targetArr){
		int count = 0;
		for(int i=0;i<4;i++){
			if (guessArr[i] == targetArr[i]){
			count++;
			}
		}
		return count;
	}
	
	int countCow(int[] guessArr, int[] targetArr){
		int count = 0;
		for(int i=0;i<guessArr.length;i++){
			for(int j=0;j<targetArr.length;j++){
				if (i != j && guessArr[i] == targetArr[j]){
					count++;
				}
			}
		}
		return count;
	}
	
	int[] StringToIntArray(String s){
		int[] intArray=new int[4];
		int strLength = s.length();
			if(strLength != 4) {
				System.out.println("Not a valid length");
		    } 
			else {
				for(int i=0;i<4;i++) {
					if (!Character.isDigit(s.charAt(i))) {
						System.out.println("Contains an invalid digit");
						break;
					}
					intArray[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
				}
			}
			return intArray;
	}
	

	public static void main(String[] args) {
		CowsAndBulls test = new CowsAndBulls();		
		int[] a = generateRamdomNonRepeatedNum();
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("please enter a number:");
			String text = input.nextLine();
			int[] guess = test.StringToIntArray(text);
			if (test.countBull(guess,a) == 4){
				System.out.println("Bull: "+test.countBull(guess,a)+"  Cow: "+test.countCow(guess,a));
				System.out.println("You Win!");
				break;
			}
			else{
				System.out.println("Bull: "+test.countBull(guess,a)+" Cow: "+test.countCow(guess,a));
			}
		}
		input.close();
		
	}

}
