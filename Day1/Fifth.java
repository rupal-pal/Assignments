/*5)	Using if…….else if….  Else,  display whether result is 
 fail, pass, second class , first class, Distinction etc. 
*/


public class Fifth {
public static void main(String args[])
{
	int ans=78;
	if(ans<100&&ans>80)
	{
		System.out.println("Distinction");
		
	}
	else if(ans<80&&ans>60)
	{
		System.out.println("first class");
	}
	else if(ans<60&&ans>40)
	{
		System.out.println("Second class");
	}
	else
		System.out.println("fail");
	
	
}
}
 