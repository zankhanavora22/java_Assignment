/*Write a program in Java to input 5 numbers from keyboard and find their
sum and average using for loop.*/
package Module_1;

import java.util.Scanner;

public class que_4 {
	public static void main(String[] args) {
		
		System.out.println("ENter 5 Numbers : ");
		
		int n=0,s=0,i,avg;
		
		for(i=0;i<5;i++) {
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			s=s+n;
		}
		
		avg=s/5;
		System.out.println("The sum of 5 numbers is : "+s);
		System.out.println("Average is :"+avg);
	}
}
