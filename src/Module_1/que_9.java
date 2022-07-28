/*Write a Java program to print the ASCII value of a given character.*/
package Module_1;

import java.util.Scanner;

public class que_9 {
	public static void main(String[] args) {
		System.out.print("Enter the character : ");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		int i=c;
		System.out.println("ASCII VALUE IS : "+i);
	}
}
