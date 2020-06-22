package assignday2;
class shape
{
	void draw()
	{
		System.out.println("Draw a Shape");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("Drwa a Circle");
	}
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("Drwa a Rectangle");
	}
}
class polygon extends shape
{
	void draw()
	{
		System.out.println("Drwa a Polygon");
	
	}
}

public class ShapeDemo {
	static void perform(shape obj)
	{
		obj.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	perform(new shape());	
	perform(new circle());
	perform(new rectangle());
	perform(new polygon());
	

	}

}
