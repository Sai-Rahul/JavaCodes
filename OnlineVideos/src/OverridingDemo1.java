class AA
{
	public void show()
	{
		System.out.println("in AA");
	}	
}
class BB extends AA
{
	public void show()
	{
		System.out.println("in B");
	}	
	public void config()
	{
		System.out.println("In Config");
	}
}
class DD extends AA
{
	public void show()
	{
		System.out.println("in D");
	}
}


public class OverridingDemo1
{
    // Runtime and Compile time polymorphism
	public static void main(String[] args) 
	{
		
    AA obj1= new BB(); // Runtime Polymorphism
    obj1.show();
    
    obj1 = new DD();
    obj1.show(); //Dynamic Method Dispatch
     
	}

}
