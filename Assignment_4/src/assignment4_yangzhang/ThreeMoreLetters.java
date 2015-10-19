package assignment4_yangzhang;

import java.util.ArrayList;

public class ThreeMoreLetters {
	
	 ArrayList<String> splitWords(String a){
		char[] charArray = a.toCharArray();
		StringBuilder sb = new StringBuilder();
		ArrayList<String> returnlist = new ArrayList<>();
		for(int i = 0; i < charArray.length; i++){
			// you ignore empty space only, not ignore punctuation.
			// for example, if you test Prof.'s example:
			// "Java is a cool OOP. It doesnt have multiple inheritance"
			// you will also print out OOP..
			if(charArray[i] == ' '){
				returnlist.add(sb.toString());
				sb.delete(0,sb.length());
			}
			else if(i == charArray.length-1){
				sb.append(charArray[i]);
				returnlist.add(sb.toString());
			}
			else{
				sb.append(charArray[i]);
			}
		}
		return returnlist;
	}
	
	public static void main(String[] args) {
		ThreeMoreLetters test = new ThreeMoreLetters();
		String a = "Have na a good day lala lala alala add aaa";
		
		ArrayList<String> arrlist = test.splitWords(a);
		for(int i = 0; i < arrlist.size(); i++) {
			if (arrlist.get(i).length() > 3){
				System.out.println(" "+arrlist.get(i));
			}
		}  
	}

}
