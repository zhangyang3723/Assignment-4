package assignment4_yangzhang;

import java.util.ArrayList;

public class ReverseWord {
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
	

	public static void main(String[] args) {
		ReverseWord test = new ReverseWord();
		String a = "Have a good day lala lala alala";
		ArrayList<String> arrlist = test.splitWords(a);
		for(int i = arrlist.size()-1; i >= 0; i--) {   
		   System.out.print(" "+arrlist.get(i));
		}  
	}

}
