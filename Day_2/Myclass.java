/*2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments

*/
  class Myclass {
	int a,b;
	Myclass()
	{
		System.out.println("this is without argument");
	}
	Myclass(int a)
	{
		this.a=a;
		System.out.println("this is with one argument"+a);
		
		
	}
	Myclass(int x,int y)
	{
		this.a=x;
		this.b=y;
		System.out.println("this is with two argument"+a+"\t"+b);
		

		
	}

	 public static void main(String[] args)
	 {
		 Myclass m1 =new Myclass();
		 Myclass m2=new Myclass(200);
		 Myclass m3=new Myclass(300,400);
	 }
 }
