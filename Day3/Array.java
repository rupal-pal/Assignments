/*1) initialize a single dimension array and sort it in ascending order */
public class Array 
{
	public static void main(String args[])
		{
	
	int arr[]=new int[] {2,6,7,1,8,9,0,4};
	
	int temp=0;

	 
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
			 
		 }
	 }
	
System.out.println("Elements of array sorted in ascending order: ");    
for (int i = 0; i < arr.length; i++) {     
    System.out.print(arr[i] + " ");    
}    
}
}