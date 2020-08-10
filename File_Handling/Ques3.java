import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*write a file copy program using byte streams.
( FileOutputStream and FileInputStream )
*/
public class Ques3
{
	public static void main(String[] args)
	{
		File f=new File("D:\\FileHandling\\Ques1.txt");
		if(!f.exists())
		{
			System.out.println("No such File Exist");
			System.exit(0);
		}
		try {
			FileInputStream fio=new FileInputStream(f);
			byte br[] = new byte[(int)f.length()];
			int k = fio.read(br);
			String ss = new String(br);
			System.out.println(ss);
			System.out.println("Reading complete");
			FileOutputStream fos=new FileOutputStream("D:\\FileHandling\\Ques_3.txt");
			fos.write(br);
			System.out.println("Writing Complete");
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
