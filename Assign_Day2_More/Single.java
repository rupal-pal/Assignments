package assignday2;

class parent
{
	int num=10;
	parent()
	{
		System.out.println("insid parent default constructor");
	}
	parent(int num)
	{
		this.num=num;
		System.out.println("inside parent para constructor");
	}
	void disp()
	{
		System.out.println("inside parent method");
	}
}

class child extends parent
{
	child()
	{
		super(30);
		System.out.println("insid child default constructor");
	}
	void disp()
	{
		super.disp();
		System.out.println("inside child method");
	}
	
}

public class Single 
{
public static void main(String args[])
{
	child obj=new child();
	obj.disp();
	
}
}
