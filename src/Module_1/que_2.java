/*Write a Java program that takes the user to provide a single character
from the alphabet. Print Vowel or Consonant, depending on the user
input. If the user input is not a letter (between a and z or A and Z), or is a
string of length > 1, print an error message.*/

package Module_1;

import java.util.Scanner;

public class que_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value : ");
		String ch = sc.next();
		
		if(ch.length()>1) {
			System.out.println("enter only one character.");
		}
		
		else if(ch.equals("a") || ch.equals("A") || ch.equals("E") || ch.equals("e") || ch.equals("i") || ch.equals("I") || ch.equals("O") || ch.equals("o") || ch.equals("u") || ch.equals("U")) {
			System.out.println("You entered vowel ");
		}
		
		else if(!(ch.charAt(0)>=65 && ch.charAt(0)<=122)) {
			System.out.println("Wrong input");
		}
		
		else {
			System.out.println("You entered consonant");
		}
		
	}
}
