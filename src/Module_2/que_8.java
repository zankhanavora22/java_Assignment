package Module_2;

class printNum{
	public void printn(int i) {
		System.out.println("This is int type data : "+i);
	}
	public void printn(float j) {
		System.out.println("This is Float type data : "+j);
	}
	public void printn(char c) {
		System.out.println("This is char type data : "+c);
	}
	public void printn(double d) {
		System.out.println("This is double type data :"+d);
	}
}
public class que_8 {
	public static void main(String[] args) {
		printNum z = new printNum();
		z.printn(8);
		z.printn(0.1234);
		z.printn(16.6);
		z.printn('Z');
		
	}
}
