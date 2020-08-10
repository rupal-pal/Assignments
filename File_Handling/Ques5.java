import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*5) accept as many as numbers from user till he presses "0"  and 
 * write these numbers in a file. 
 * Now Open a file and read these numbers. 
 * ( Hint :- use Scanner class for input, FileOutputStream, 
 * DataOutputStream, FileInputStream , DataInputStream)
 */
public class Ques5
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int k=0;
	int cnt=0;
	
	try {
		FileOutputStream fos=new FileOutputStream("D:\\FileHandling\\Ques5.txt");
	   DataOutputStream db=new DataOutputStream(fos);
	   System.out.println("enter the Number");
	   while( (k=sc.nextInt())!=0)
	   {
		   db.writeInt(k);
		   cnt++;
	   }
	   
	
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try(FileInputStream fis = new FileInputStream("D:\\FileHandling\\Ques5.txt")){
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("Reading values from file");
		for(int i=0;i<cnt;i++){
			System.out.println(dis.readInt());
		}
			
	
}  catch (
		Exception ae) {
	// TODO Auto-generated catch block
	ae.printStackTrace();
}
}
}


