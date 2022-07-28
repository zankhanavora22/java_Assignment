/*Write a Java program that reads a positive integer and count the number
of digits the number.
Input an integer number less than ten billion: 125463 Number of digits in
the number: 6*/
package Module_1;
import java.util.Scanner;
public class que_7 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("ENter Number : ");
			int a = sc.nextInt();
			int cnt =0;
			
			while(a!=0) {
				a=a/10;
				cnt++;
			}
			System.out.println("Count of digit is :" +cnt);	
		}
}
