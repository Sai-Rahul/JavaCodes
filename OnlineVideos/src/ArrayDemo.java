	
	public class ArrayDemo
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
						
				
			{
				System.out.print(" "+d[i][j]);
			}
	
	             System.out.println();
		}
	
		}
	}
