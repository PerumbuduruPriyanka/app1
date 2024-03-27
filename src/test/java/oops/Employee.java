package oops;

public class Employee {
	int Empid;
	String Ename;
	String EJob;
	int ESal;
	void Display() {
		System.out.println(Empid);
		System.out.println(Ename);
		System.out.println(EJob);
		System.out.println(ESal);
		
	}
	void Show() {
		System.out.println("priyanka");
	}

	public static void main(String[] args) {
		Employee Em1=new Employee();
		Em1.Empid=123;
		Em1.Ename="priyanka";
		Em1.EJob="tester";
		Em1.ESal=100002000;
		Em1.Display();
		Em1.Show();
		
		

	}

}
