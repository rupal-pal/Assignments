/*5) create abstract class Shape. declare "draw()" function as abstract. 
	From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.
*/
abstract class Shape
{
	abstract void draw();
	
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("This is a Triangle");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("This is a Polygon");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("This is a Circle");
	}
}


public class Assign5 {

	public static void main(String[] args) {
		Shape arr[]=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw();
		}
		
		// TODO Auto-generated method stub

	}

}
