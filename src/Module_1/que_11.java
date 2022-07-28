/*Write a Java program to display the system time*/
package Module_1;

import java.time.LocalDateTime;

public class que_11 {
	public static void main(String[] args) {
		LocalDateTime t = LocalDateTime.now();
		System.out.println("Current time is :"+t);
	}
}
