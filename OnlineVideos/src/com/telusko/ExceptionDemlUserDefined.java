package com.telusko;

public class ExceptionDemlUserDefined 
{
   public static void main(String args[])
   {
	   int i,j;
	   i=8;
	   j=9;
	   try
	   {
		   int k= i/j;
		   
		   if (k==0)
			   throw new TelusukoException();
		       System.out.println(k);
	   }
	   catch (TelusukoException e)
	   {
		   System.out.println(" Error "  + e.getMessage());
	   }
   }
}
