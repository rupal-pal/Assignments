
/*
2) create a class "DemoArr",with the function "disp". create 4 objects of this
 class in an array.
Traverse the array and invoke "disp" on each objects.
*/

public class Array2{
	public static void main(String[] args){
		DemoArr arr[] = new DemoArr[3];
		for(int i = 0; i < arr.length; i++){
			arr[i] = new DemoArr();
		}
		for(int i = 0; i < arr.length; i++){
			arr[i].disp();
		}
	}
}

class DemoArr{
	public void disp(){
		System.out.println("in disp");
	}
}