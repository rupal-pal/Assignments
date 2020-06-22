package assignday2;
 class Check
 {
	 int num=10;
	 private int num1=20;
	 public int num3=30;
	 protected int num4=40;
	 
	public  void disp()
	 {
		 System.out.println(num+"\t"+num1+"\t"+num3+"\t"+num4);
	 }
 }



public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Check obj=new Check();
System.out.println(obj.num);
//System.out.println(obj.num1);//cannot access directly because it is private
System.out.println(obj.num3);
System.out.println(obj.num4);
obj.disp();
	}

}
