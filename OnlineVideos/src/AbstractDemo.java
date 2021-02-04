abstract class writer
{
	
}

class pen extends writer
{
	
}
class pencil extends writer
{
	
}

class printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
	//public void show(Double i)
	//{
		//System.out.println(i);
    //}
}



public class AbstractDemo {

	public static void main(String[] args) 
	{
	   printer obj = new printer();
	   obj.show(5.5);
	}

}
