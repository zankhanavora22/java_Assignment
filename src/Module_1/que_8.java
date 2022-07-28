/*Write a Java program to count the letters, spaces, numbers and other
characters of an input string.*/
package Module_1;

import java.util.Scanner;

public class que_8 {
	public static void main(String[] args) {
		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char[] ch=name.toCharArray();
		
		int l=0,num=0,s=0,o=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' ) {
				l++;
			}
			else if(ch[i]>='0' && ch[i]<='9') {
				num++;
			}
			else if(ch[i]==' ') {
				s++;
			}
			else {
				o++;
			}
		}
		
		System.out.println("Total Letter : "+l);
		System.out.println("Total Number : "+num);
		System.out.println("Total Space  : "+s);
		System.out.println("Other words  : "+o);
	}
}
