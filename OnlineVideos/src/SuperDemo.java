class A
{
	public A() // Created a Constructor Named A
	{
		System.out.println("in A");
	}
	public A(int i) // Created a parameterized Constructor Named A
	{
		System.out.println("in A int");
	}
}
class B extends A
{
	public B() // Created a Constructor Named A
	{
		super();
		System.out.println("in B");
	}
	public B(int i) // Created a parameterized Constructor Named B
	{
		super(i);
		System.out.println("in B int"); //By mentioning parameter in super class, it will call parameterized method
		                                // By default it will call default constructor
	}
}



public class SuperDemo {

	public static void main(String[] args)
	{
		B obj1= new B(5);
		

	}

}
