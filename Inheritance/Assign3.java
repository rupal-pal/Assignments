
/*
3) Go for Hierarchical inheritance, create instances of child
class and observe constructor invocation.
*/

class base
{
	base()
	{
		System.out.println("inside Parent class");
	}
}
class child extends base
{
	child()
	{
		System.out.println("inside child class");
	}
}
class child1 extends base
{
	child1()
	{
		System.out.println("inside child1 class");
	}
}
class child2 extends base
{
	child2()
	{                        //super();
		System.out.println("inside cild2 class");
	}
}
public class Assign3 {

	public static void main(String[] args)
	{
	child2 obj=new child2();
	child1 obj1=new child1();

	child obj2=new child();

	

	}

}
