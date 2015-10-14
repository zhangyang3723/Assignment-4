package assignment4_yangzhang;

import java.util.ArrayList;


public class CapitalizeFirstLetter {
	
	ArrayList<String> splitWords(String a){
		char[] charArray = a.toCharArray();
		StringBuilder sb = new StringBuilder();
		ArrayList<String> returnlist = new ArrayList<>();
		for(int i = 0; i < charArray.length; i++){
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
	
	String UpperFirstLetter(ArrayList<String> arrlist){
		for(int i = 0; i < arrlist.size(); i++) {
			String b = arrlist.get(i);
			System.out.print(" "+capitalizeOneWord(b));
		}
		return "";
	}
	
	String capitalizeOneWord(String word) {
		   return Character.toUpperCase(word.charAt(0)) + word.substring(1);
		}
	
	
	public static void main(String[] args) {
		CapitalizeFirstLetter test = new CapitalizeFirstLetter();
		String a = "have a good day lala lala alala";
		ArrayList<String> arrlist = test.splitWords(a);
		String display = test.UpperFirstLetter(arrlist);
		System.out.println(display);
		
	}

}
