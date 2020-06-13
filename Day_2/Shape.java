/*1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access
 *  these attributes directly.provide accessor methods on these attributes and allow them to 
 *  call from outside of your class.

 */



class MyClass {
	private int height,width;
	
MyClass(int h,int w)
	{
	height=h;
	width=w;
	}
void showdata()
{
	  System.out.println(height);
	  System.out.println(width);
	  
}
	

}
   class Shape
{
	  public static void main(String[]args)
	  {
	  MyClass m1=new MyClass(200,300);
	  m1.showdata();
	
 }
}
 


