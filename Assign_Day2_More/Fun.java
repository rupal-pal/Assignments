package assignday2;

class test1
{
	void disp(int a,int b)
	{
		System.out.println("the value of a and b is:"+a+"\t"+b);
	}
}
class test2 extends test1
{
	void disp(int a)
	{
		System.out.println("the value of a  is:"+a);
		super.disp(50,60);
	}
}

public class Fun 
{
	public static void main(String[] args)
	{
		test2 t=new test2();
		t.disp(10);
	//	t.disp(20,30);
	}

}
