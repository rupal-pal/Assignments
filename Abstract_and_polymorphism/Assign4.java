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
	static void perform(Top ref)
	{
		ref.disp();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
perform(new Bottom1());
perform(new Bottom2());
perform(new Bottom3());

		
				

	}

}
