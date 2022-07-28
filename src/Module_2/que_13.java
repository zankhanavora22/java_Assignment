package Module_2;

class rectangle{
	double length;
	double width;
	int sq;
	rectangle(int sq){
		this.sq=sq;
	}
	rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	public void RectArea() {
		System.out.println("Area of Reactangle is : "+(length*width));
		
	}
	public void Rectperimeter() {
		System.out.println("Perimeter of Rectangle is : "+(2*(length+width)));
	}
}

class square extends rectangle{

	square(int sq) {
		super(sq*sq);
		System.out.println("Squere is :"(sq*sq));
	}
	
}
public class que_13 {
	public static void main(String[] args) {
		
	}
}
