package assignment4_yangzhang;

import java.util.ArrayList;

public class FibonacciNumGenerator {
    
	int nextFiNum(int a, int b){
		return a+b;
	}
	
	ArrayList<Integer> generateFiNum(int max){
		ArrayList<Integer> al = new ArrayList<>();
		int n = 2;
		if(max < 1){
			return al;
		}
		al.add(1);
		al.add(1);
		if(max == 1){
			return al;
		}
		else{
			while(al.get(n-1) + al.get(n-2) <= max){
				al.add(al.get(n-1) + al.get(n-2));
				n++;
			    
			}
			return al;
		}
	}
	
	
	public static void main(String[] args) {
		FibonacciNumGenerator test = new FibonacciNumGenerator();
		ArrayList<Integer> arrlist = test.generateFiNum(144);
		for(int i = 0; i < arrlist.size(); i++) {			
				System.out.print(" "+arrlist.get(i));			
		}  
	}

}
