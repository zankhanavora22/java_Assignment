/*Write a Java program that accepts an integer (n) and computes the value
of n+nn+nnn.
Input number: 5
5 + 55 + 555
*/
package Module_1;
import java.util.Scanner;
public class que_10 {
	public static void main(String[] args) {
		System.out.print("ENter Digit :" );
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		System.out.print(i+"+"+i+i+"+"+i+i+i);
	}
}
