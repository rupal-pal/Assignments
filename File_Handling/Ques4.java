import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*4) Write a file copy program using unicode character streams.
( FileWriter and FileReader )
*/
public class Ques4 {
	public static void main(String[] args) 
	{
		File f=new File("D:\\FileHandling\\Ques1.txt");
		if(!f.exists())
		{
			System.out.println("No such file Exist");
			System.exit(0);
		}
		try {
			FileReader fr=new FileReader(f);
			char c[]=new char[(int)f.length()];
			int k=fr.read(c);
			String ss=new String(c);
			System.out.println(ss);
			System.out.println("Reading Complete");
			FileWriter fw=new FileWriter("D:\\FileHandling\\Ques4.txt");
			fw.write(c);
			String s=new String(c);
			System.out.println(c);
			System.out.println("Writing Complete");
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
