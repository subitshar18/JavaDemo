/**
 * 3. Given a string Str. The task is to check if it is Pangram or not.    
 * A pangram is a sentence containing every letter in the English Alphabet.
Examples: 
Input: “The quick brown fox jumps over the lazy dog” 
 Output: is a Pangram  Explanation: 
Contains all the characters from ‘a’ to ‘z’] 
Input: “The quick brown fox jumps over the dog”
 Output: is not a Pangram 
 Explanation: Doesn’t contain all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing
 */
package com.subi;

import java.util.HashSet;
import java.util.Set;

public class PangramString {
	public static void checkPangram(String str) {
		char[] c=str.toCharArray();
		Set <Character> characters=new HashSet<>();
		for(char ch:c) {
			if(Character.isAlphabetic(ch)) {
				characters.add(ch);
			}
		}
		if(characters.size()==26) {
			System.out.println("The string is Panagram");
		}
		else {
			System.out.println("The string is not panagram");
		}
		
	}

	public static void main(String[] args) {
		String string1="The quick brown fox jumps over the lazy dog";
		String string2="The quick brown fox jumps over the dog";
		string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		checkPangram(string1);
		checkPangram(string2);
	}

}
