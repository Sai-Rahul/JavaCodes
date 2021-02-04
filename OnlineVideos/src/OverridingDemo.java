class D
{
	public void show()
	{
		System.out.println("in D");
	}	
}
class C extends D
{
	@Override
	public void show()
	{
		super.show(); // by using super class we can call both methods class D and Class C
		System.out.println("in C"); //Child Class C method overriding the method of Class D i.e Method Overriding
	}	
}


public class OverridingDemo {

	public static void main(String[] args) 
	{
		
    C obj1= new C();
    obj1.show();
     
	}

}
