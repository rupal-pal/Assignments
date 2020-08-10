import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*1)accept 10 characters from a user ( use Scanner).
store these 10 characters in a file. (FileWriter)
Now open a file and read all these characters.

*/


public class Ques1 
{
	public static void main(String[] args)
	{
		try(FileWriter fw=new FileWriter("D:\\FileHandling\\Ques1.txt"))
		{
		
			char c[]=new char[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 10 Character");
			for(int i=0;i<10;i++)
			{
				c[i]=sc.next().charAt(0);
			}
			fw.write(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try(FileReader fr=new FileReader("D:\\FileHandling\\Ques1.txt"))
		{
			
			char arr[]=new char[(int)new File("D:\\FileHandling\\Ques1.txt").length()];
			fr.read(arr);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch (Exception ae) 
		{
			ae.printStackTrace();
		}
		
	}

}
