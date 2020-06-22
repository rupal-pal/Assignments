/*
6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.
*/


package interfaceAssign;

interface A
{
	void disp();
}
interface B extends A
{
	void disp2();
}
 class C implements B
{
	public void disp()
	{
		System.out.println("inside interface of A disp");
	}
	public void disp2()
	{
		System.out.println("inside interface of B disp2");
	}
	
}

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
obj.disp();
obj.disp2();
	}

}
