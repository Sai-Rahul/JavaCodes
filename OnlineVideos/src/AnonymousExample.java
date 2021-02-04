class Y
{
	public void show()
	{
		System.out.println("In Z show");
	}
}




public class AnonymousExample {

	public static void main(String[] args) 
	{
		Y obj= new Y()
				{
			public void show()
			{
				System.out.println("In Y show");
			}
				};
		obj.show();
 
	}

}
