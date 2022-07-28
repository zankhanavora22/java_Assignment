/*Write a Java program to Take three numbers from the user and print the 
  greatest number.*/
package Module_1;

import java.util.Scanner;

public class que_1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 1st number : ");
			int a = sc.nextInt();
			System.out.println("Enter 2nd number :");
			int b = sc.nextInt();
			System.out.println("Enter 3rd number :");
			int c = sc.nextInt();
			
			if(a>b && a>c) {
				System.out.println("A is greater...");
			}
			else if(b>a && b>c){
				System.out.println("B is greater...");
			}
			else {
				System.out.println("C is greater...");
			}
		}
}
