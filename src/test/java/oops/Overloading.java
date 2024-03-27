package oops;

public class Overloading {
	void Q(int a,String Kan)
	{
		System.out.println("Q");
		}
	void Q(String name,int b)
	{
		System.out.println("Zero");
	}
	Overloading(int c)
	{
		
	}
	Overloading()
	{
		
	}
	public static void main(String[] args) {
		Overloading OL=new Overloading();
		OL.Q("priyanka",20);

	}

}
