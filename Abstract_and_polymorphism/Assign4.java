/*
4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.
*/

class Top
{
	void disp()
	{
		System.out.println("inside disp method of class top");
	}
}
class Bottom1 extends Top
{
	void disp()
	{
		System.out.println("inside disp method of Bottom1 top");
	}
}
class Bottom2 extends Top
{
	void disp()
	{
		System.out.println("inside disp method of Bottom2 top");
	}
}
class Bottom3 extends Top
{
	void disp()
	{
		System.out.println("inside disp method of Bottom3 top");
	}
}



public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top obj=new Bottom1();//upcasting
		obj.disp();//late binding
		Top obj1=new Bottom2();
		obj1.disp();
		Top obj2=new Bottom3();
		obj2.disp();
		
				

	}

}
