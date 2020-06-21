import shapepack.Circle;
import shapepack.Rectangle;
import shapepack.Shape;
import shapepack.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape arr[]=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Rectangle();
		arr[2]=new Circle();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw();
		}
		
		// TODO Auto-generated method stub

	}
	

}
