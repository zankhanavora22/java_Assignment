package Module_2;

class printIntChar{
	public void show(int i, char c) {
		System.out.println("Integer value is "+i+ " and character value is "+c);
	}
	public void show(char c,int i) {
		System.out.println("Character value is "+c+ " and Integer value is "+i);
	}
}
public class que_9 {
	public static void main(String[] args) {
		printIntChar p = new printIntChar();
		p.show(5, 'A');
		p.show('Z', 1);
	}
}
