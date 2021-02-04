class Calc2
{
	public int add(int... n) //4,5,6,7,8 //Variable Length Arguments
	{
		int sum=0;
		for(int i :n)
		{
			sum= sum+i;
			
		}
		return sum;
	}
}


public class Varargs {

	public static void main(String[] args) 
	{
		Calc2 obj= new Calc2();
		System.out.println(obj.add(4,5,6,7,8,8,8,700,67,6,6,5,54));

	}

}