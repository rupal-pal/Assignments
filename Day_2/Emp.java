/* 3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?

*/



public class Emp
{
	private static int cnt=20;
	 public static void demo()
	 {
		System.out.println(cnt); 
	 }
	 
	 public static void main(String args[])
	 {
		 int a=2;
		 Emp.demo();
			System.out.println(a); 
	 }
}