interface Writer1
{
	public abstract void write();
}


class penn implements Writer1
{
	public void write()
	{
		System.out.println("Im a Pen");
	}
}
class pencill implements Writer1
{
	public void write()
	{
		System.out.println("Im a Pencil");
	}
}
class Kit
{
	public void dosomething(Writer1 p)
	{
		p.write();
	}
}


public class AbstracttDemo 
{
     public static void main(String args[])
     {
    	Kit k = new Kit();
    	Writer1 p = new penn();
    	
    	Writer1 pc = new pencill();
    	
    	k.dosomething(pc);
     }
   
}
