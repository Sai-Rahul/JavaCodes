package com.telusko;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[6];
			a[6]=8;
			int i=7;
			int j=0;
			int k= i/j;
			System.out.println("output is " + k);
		}
		catch (ArithmeticException |ArrayIndexOutOfBoundsException e) // Multiple Catch is available after java 1.7
		{
			System.err.println("Error");
		}
		finally
		{
			
		System.out.println("Bye");
		}
		

	}
}
