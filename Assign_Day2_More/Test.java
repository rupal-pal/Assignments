package assignday2;

class parents
{
	parents()
	{
		System.out.println("inside the parent default consructor");
	}
	void fun(int num)
	{
		System.out.println("inside the method of parent"+num);
	}
}
class childs extends parents
{
	
	childs()
	{
		System.out.println("inside the child default consructor");
	}
	void fun(int num)
	{
		System.out.println("inside the method of child"+num);
		super.fun(20);
	}
}
public class Test
{
	public static void main(String args[])
	{
		childs obj=new childs();
		obj.fun(10);
		
	}

}
