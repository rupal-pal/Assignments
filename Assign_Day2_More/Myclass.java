package assignday2;

 class Demo 
 {
	private int num=10; //non static variable
	static int ans=20; //static variable
	
	
	void fun()     //non_static member function
	
	{
		System.out.println("inside a method of non static variable"+"\t"+num);
		
	}
	
	
	static  void disp()    //static member function
	{
		System.out.println("inside static method"+"\t"+ans);
	}


}

public class Myclass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.fun();
		Demo.disp();
				

	}
}

