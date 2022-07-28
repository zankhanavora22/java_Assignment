package Module_2;

class member{
	String name;
	int age;
	String M_no;
	String Address;
	int salary;
	
	member(String name, int age, String M_no, String Address){
		this.name = name;
		this.age = age;
		this.M_no = M_no;
		this.Address = Address;
	}
	public void printsalary(int salary) {
		System.out.println("Salary : "+salary+"\n");
	}
}
class employee extends member{
	String specialization;
	employee(String name, int age, String M_no, String Address, String specialization) {
		
		super(name, age, M_no, Address);
		this.specialization=specialization;
		System.out.println("Name is :"+name);
		System.out.println("Age is : "+age);
		System.out.println("Mobile no is : "+M_no);
		System.out.println("Address is : "+Address);
		System.out.println("Specialization :"+specialization);
	}	
}

class Manager extends member{
	String department;
	Manager(String name, int age, String M_no, String Address,String department) {
		super(name, age, M_no, Address);
		this.department=department;
		System.out.println("Name is :"+name);
		System.out.println("Age is : "+age);
		System.out.println("Mobile no is : "+M_no);
		System.out.println("Address is : "+Address);
		System.out.println("Department : "+department);
	}
}
public class que_12 {
	public static void main(String[] args) {
		employee e = new employee("Zankhana",19,"7283903025","Ahmedabad","IT");
		e.printsalary(40000);
		
		Manager m = new Manager("Dhruvi",19,"9724652345","Ahmedabad","HR");
		m.printsalary(50000);
		
	}
}
