/*
8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
*/
class base1
{
	int num=30;
	base1(int num)
	{ 
		this.num=num;
		System.out.println("inside base1 para construtor"+num);
	
		
	}
	
}
class sub1 extends base1
{
	sub1()
	{
		super(30);
		System.out.println("child sub1 default contr");
	}
	sub1(int num)
	{
		super(40);
		System.out.println("child sub1 one para contr"+num);
	}
	sub1(int a,int b)
	{
		super(50);
		System.out.println("child sub1 two para contr"+a+"\t"+b);
	}
}
public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 obj1=new sub1();
		sub1 obj2=new sub1(100);
      sub1 obj=new sub1(10,20);
	}

}
