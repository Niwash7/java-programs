package tY.practise;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String str = "India";
		String s = str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character> () ;
		         
		for (int i = 0 ; i <s.length() ; i++) {
			set.add(s.charAt(i));
		}
		for (Character c : set) {
			System.out.println(c + " ") ;
		}
	}
}
