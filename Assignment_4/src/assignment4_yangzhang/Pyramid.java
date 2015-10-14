package assignment4_yangzhang;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		int a = input.nextInt();
		
		int y = 1;
		for(int i=0; i<= a ;i++){
			for(int n = 0;n<a-i;n++){
				System.out.print(" ");
             }
            for(int j=1; j <= i ; j++){
            	System.out.print(y + " ");
                y = y + 1;
             }
            
            System.out.println("");
		}
		input.close();
	}
}
