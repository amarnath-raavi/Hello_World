

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	
	/**
	 * This function  verifies whether the given string is palindrome or not. 
	 * returns true if palindrome.
	 * returns false if not a palindrome.
	 */
	public static boolean isPalindrome(String palindromeString) {
	
	String string1=palindromeString;
	String string2=string1.replaceAll("[^A-Za-z0-9]","");
	//String string3=string2.replaceAll("[0-9]","");
	String string4=string2.replaceAll("\\s+","");
	String input=string4.toLowerCase();
	String reverse="";	
	Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

    while (!stack.isEmpty()) {
        reverse = reverse+stack.pop();
    }

	if(input.equals(reverse)){
		return true;
	}
	else {	
		return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner scan=new Scanner(System.in);
	    String string = scan.nextLine();
	    if(isPalindrome(string)) {
	    System.out.println("The Given Input is \n'" + string + "' A Palindrome ");
	    }
	    else {
	    System.out.println("The Given Input is \n'" + string + "' NOT A Palindrome ");
	    }
	    scan.close(); 
	}
}
