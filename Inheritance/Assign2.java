
/*
2) create a class "Vehicle", define a method "public void start()" in it. 
From this class derive a class FourWheeler. 
How will u override "start()" method of parent class ?
*/

class Vehicle
{
	public void start()
	{
		System.out.println("Start the Vehicle");
	}
}

class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("inside Fourwheeler");
		super.start();
	}
	
}
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourwheeler obj=new Fourwheeler();
		obj.start();

	}

}
