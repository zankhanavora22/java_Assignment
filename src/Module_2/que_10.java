package Module_2;

class Area2{
	public void PrintArea(double l, double b) {
		System.out.println("Area of rectangle is "+(l*b));
	}
	public void PrintArea(double n) {
		System.out.println("Area of Square is "+(n*n));
	}
}
public class que_10 {
	public static void main(String[] args) {
		Area2 a = new Area2();
		a.PrintArea(12.5, 5.7);
		a.PrintArea(8);
	}
}
