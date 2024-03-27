package oops;
class A
{
public void display()
{
System.out.println("display score");


}
}
class B extends A
{
public void info()
{
System.out.println("info completed");
display();
}
}

public class MainClass {

	public static void main(String[] args) {
		B b = new B();
		b.info();


	}
			}
		

	

