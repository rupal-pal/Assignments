/*
1) Create a multi-level inheritance , instantiate the child class and
observe constructor invocation.Also show, if needed how will u invoke parent 
class constructor from child class ?
*/



class Parent
{
	int k=30;
	Parent()
	{
		System.out.println("inside Parent");
	}
	Parent(int k)
	{
		System.out.println("inside parent consturctor"+k);
	}
}
class Child extends Parent
{
	Child()
	{
		super(40);
		System.out.println("inside Child ");
	}
}
class GrandChild extends Parent
{
	int k=30;
	GrandChild()
	{
		
		System.out.println("inside  deafult Grandchild");
	}
	GrandChild(int k)
	{
		super(50);
		System.out.println("inside para constructor og grandchild"+k);
	}
}

public class Assign1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
GrandChild obj=new GrandChild(10);

	}

}

