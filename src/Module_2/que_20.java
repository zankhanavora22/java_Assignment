package Module_2;
abstract class shape{
	abstract public void RectangleArea(float l,float b);
	abstract public void SquareArea(float s);
	abstract public void Circle(float r);
}
class Area extends shape{

	@Override
	public void RectangleArea(float l, float b) {
		// TODO Auto-generated method stub
		System.out.println("Area of Reactangle is: "+(l*b));
		
	}

	@Override
	public void SquareArea(float s) {
		// TODO Auto-generated method stub
		System.out.println("Area of square is : "+(s*s));
		
	}

	@Override
	public void Circle(float r) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is : "+(3.14*r*r));
		
	}
	
}
public class que_20 {
	public static void main(String[] args) {
		Area A=new Area();
		
		A.RectangleArea(15, 20);
		A.SquareArea(15);
		A.Circle(5);
		
	}
}
