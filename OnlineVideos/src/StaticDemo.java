class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static //  static block will be executed when we load the class
	{
		ceo = "larry";
		System.out.println("in static");
	}
	
	public Emp()// constructor will be executed when you create an object
	{
		eid =1;
		salary= 3000;
		System.out.println("in constructor");
		
	}
	
	public void show()
	{
		System.out.println(eid + ":"+ salary +":"+ ceo);
	}
}

public class StaticDemo 
{
  public static void main(String args[])
  {	  
	  System.out.println(Emp.ceo);
	  Emp navin=new Emp();  
	  Emp rahul= new Emp(); 
	  
	  rahul.show();
	  navin.show();
	  System.out.println(rahul.ceo);
	  System.out.println(Emp.ceo);
	 
  }
}