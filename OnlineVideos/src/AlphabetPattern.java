
public class AlphabetPattern
{
	public static void main(String args[])
	{
		int A=65;
		for(int i=0;i<=25; i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print((char)(A + j)+ " ");
			}
			System.out.println();
		}
	}

}
