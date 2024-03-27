package oops;

public class Employee1 {
	String name;
	int Id;
	String Job;
	int Sal;
	Employee1(String name,int Id, String Job, int sal){
		 this.name=name;
		 this.Id=Id;
		 this.Job=Job;
		 this.Sal=Sal;
	}
	void Display() {
		System.out.println(name);
		System.out.println(Id);
		System.out.println(Job);
		System.out.println(Sal);
	}

	public static void main(String[] args) {
		Employee1 em2= new  Employee1("madhavi",123,"TestEngg",90000);
		em2.Display();
		

	}

}
