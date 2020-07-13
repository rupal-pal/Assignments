/*4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.
*/

package Assignment4;

public class Item 
{
	public String Itemid;
	public String Name;
	public int Cost;
	
	Item(String s,String n,int c)
	{
		this.Itemid=s;
		this.Name=n;
		this.Cost=c;
	}
	
	public void disp()
	{System.out.println("Details Are");
	System.out.println("Id :"+Itemid);
	System.out.println("Name :"+Name);
	System.out.println("Cost :"+Cost);
		
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Item obj=new Item("5","Book",200);
         obj.disp();
         System.out.println("--------------------------");
         Item obj1=new Item("10","pen",50);
         obj1.disp();
	}

}
