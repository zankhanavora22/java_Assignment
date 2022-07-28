/*Write a Java program that takes a year from user and print whether that
year is a leap year or not. B19. Write a program in Java to display the first
10 natural numbers using while loop.*/
package Module_1;

import java.util.Scanner;
public class que_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year :");
		int i=sc.nextInt();
		
		if(i%4==0 || i%400==0 && i%100==0) {	
			System.out.println("Leap year...");
		}
		
		else {
			System.out.println("Not Leap Year...");
		}
		
		for(int j=1;j<=10;j++) {
			System.out.println("j="+j);
		}
	}
}
