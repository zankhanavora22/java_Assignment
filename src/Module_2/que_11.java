package Module_2;
class parent{
	public void prints() {
		System.out.println("This is Parent Class Method");
	}
}

class child extends parent{
	public void prints() {
		super.prints();
		System.out.println("This is Child Class method");
	}
}
public class que_11 {
	public static void main(String[] args) {
		parent p = new parent();
		p.prints();
		child c = new child();
		c.prints();
		
		
	}
}
