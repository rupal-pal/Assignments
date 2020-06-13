/*4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)
*/

public class DemoOb {

	int num=100;
	public static void main(String args[])
	{
		DemoOb d=new DemoOb();//1.Obj is a reference created on STACK referring to object
		//created on HEAP
		d=new DemoOb();//Here Obj will refer to new instance created and will 
		//not store the address of first 
		DemoOb d1=new DemoOb();//object which was created in the
		//first line i.e Demo obj=new Demo(); 
	}
	
}
