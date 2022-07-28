/*Write a Java program to print numbers between 1 to 100 which are
divisible by 3, 5 and by both.*/
package Module_1;

public class que_12 {
	public static void main(String[] args) {
		
		
		System.out.println("There are numbers which is Divisible by 3");
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n\nThere are numbers which is Divisible by 5");
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n\nThere are numbers which is divisible by 3 and 5");
		for(int i=0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
