
import java.io.*;
class Myarithexception extends RuntimeException
{
	public Myarithexception(String mess)
	{
		super(mess);
	}
}

class calculator //extends Myarithexception
{
	public double fn(int k)
	{
		if(k<0)
		{
			throw new Myarithexception("Neative not allowed");
		}
		else if(k==0)
		{
			throw new Myarithexception("Zero not allowed");
		}
		else 
		{
			double d=k;
			return d;
		}
			
	}
}


public class MyCalcApp {

	public static void main(String[] args) throws IOException
	{
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String s=new String();
	System.out.println("Enter an Int type No:");
	s=br.readLine();
	int a=Integer.parseInt(s);
	
	calculator obj=new calculator();
	System.out.println(obj.fn(a));
	

	}

}
