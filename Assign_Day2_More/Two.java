package assignday2;

class First
{
	private int num;
	First(int num)
	{
		System.out.println("inside constructor of disp1");
		this.num=num;
	}
	void disp1()
	{
	System.out.println("inside disp1 method"+"\t"+num);
	}
}
class Second
{
	 private int num1;
	 Second(int num1)
	 {
		 System.out.println("inside constructor of disp2");
			this.num1=num1;
	 }
	 void disp2()
	 {
		 System.out.println("inside disp2 method"+"\t"+num1);
	 }
}


public class Two {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       First obj=new First(10);
       obj.disp1();
       Second obj1=new Second(20);
       obj1.disp2();
	}

}
