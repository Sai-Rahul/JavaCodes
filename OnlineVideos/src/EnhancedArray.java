
public class EnhancedArray 
{

	public static void main(String[] args) 
	{

		//int a[]= {6,65,78,99};
		//int b[]= {2,4,5,6};
		//int c[]= {45,66,6,77};
		int d[][]= {
			     {6,65,78,99},
	             {2,4,6},          //JaggedArray
	             {45,66,6,77,9}
	           
	           };
	
	
	
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d[i].length;j++)
				
		                                  // Normal Style of using for loop
	{
		System.out.print(" "+d[i][j]);
	}

        System.out.println();
}
	for (int k[]:d)
    {
  	  for (int l :k)
  	  {
  		  System.out.print(" "+ l);   // Enhanced Style of using for loop
  	  }	
  	  System.out.println();
    }
   

	}
}

