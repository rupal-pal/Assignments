/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
*/

package interfaceAssign;

class Parent1
{
	void disp()
	{
		System.out.println("in parent1  disp");
	}
}
interface Parent2
{
	void disp2();
}
class child extends Parent1 implements Parent2
{
	public void disp2()
	{
		System.out.println(" in parent2 disp2");
	}
}
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         child obj=new child();
         obj.disp();
         obj.disp2();
         
        		 
	}

}
