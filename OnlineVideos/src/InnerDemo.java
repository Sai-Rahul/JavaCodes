//Inner class will have 3 classes
 // Memeber class
 // Static Class
 //Anonymous Class 








class Outer
{
	static int a;
	static public void show()
	{
		
	}
	static class Inner //Outer$Inner.class
	{
		public void display() 
		{
			System.out.println("in display");
		}
	}
}


public class InnerDemo 
{

	public static void main(String[] args) 
	{
		Outer obj= new Outer();
		obj.show();
		
        Outer.Inner obj1= new Outer.Inner(); //In order to access the inner class we need to specify Outer Class with its obj
        obj1.display();
	}

}
