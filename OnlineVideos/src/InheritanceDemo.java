//2 Types of Inheritace
// IS-A



class Calculator //Super
{
	public int add(int i, int j)
	{
		return i+j;
	
	}
}

class CalcAdv extends Calculator //Subclass
{
	public int sub(int i, int j)
	{
		return i-j;
    }
}
class CalcVeryAdv extends CalcAdv
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo
{

	public static void main(String[] args) 
	{
     CalcVeryAdv c1= new CalcVeryAdv();
     int result1 = c1.add(5, 4);
     int result2 = c1.sub(9, 4);
     int result3= c1.mul(3,4);
     
     
     System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);
	}

}
  