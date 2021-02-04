class Cala
{
	int num1;
	int num2;
	int result;
	
	public Cala()
	{
		num1=5;
		num2=5;
		System.out.println("In Constructor");	//Default constructor
	}
	public Cala(int n)
	{
		num1=n;
		num2=n;
	}
	public Cala(double d)
	{
		num1=(int)d;
	}
}

public class ObjDemo {

	public static void main(String[] args)
	{
		Cala obj=new Cala(9.5);
		System.out.println(obj.num1);
		

	}

}
