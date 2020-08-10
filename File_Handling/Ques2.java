import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*) using RandomAccessFile class create a file.
accept a message from user and write in a file.
now read the message which u have stored in a file.
now again accept a message and write in a file at the end of existing message.
now read the entire content of file . ( u should be able to read both the messages now)
*/
public class Ques2 
{
	public static void main(String[] args) 
	{
		try(RandomAccessFile rm=new RandomAccessFile("D:\\FileHandling\\ques_2.txt", "rw"))
		{
			rm.seek(rm.length());
			
			System.out.println("enter the data");
			byte b[]=new byte[50];
			int k=System.in.read(b);
			rm.write(b,0,k);
			rm.seek(0);
			byte b1[]=new byte[(int)new File("D:\\FileHandling\\ques_2.txt").length()];
			rm.read(b1);
			String ss=new String(b1);
			System.out.println(ss);
			rm.seek(rm.length());
			System.out.println("enter the data again");
			k=System.in.read(b);
			rm.write(b,0,k);
			System.out.println("After Reading All Data");
			rm.seek(0);
			 b1=new byte[(int)rm.length()];
			 rm.read(b1);
			 ss=new String(b1);
			 System.out.println(ss);
			
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		
		
	}

}
}
