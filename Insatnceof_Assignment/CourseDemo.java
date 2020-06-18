/*create a hierarchy

				Course

					void start()
					void end()

override "start()" and "end()" in all the child classes.

		MsCit		Basic		Dbda
							void orientation()



write a class "CourseDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any course and invoke
	 "start()" and "end()" functions.

	also make sure if "Dbda" is passed , its "orientation()" method also should be called.
*/




class Course
{
	void start()
	{
		System.out.println("start the couse");
	}
	void end()
	{
		System.out.println("end the course");
	}
}
class Mscit extends Course
{
	void start()
	{
		System.out.println("start the couse of mscit");
	}
	void end()
	{
		System.out.println("end the course of mscit");
	}
}

class Basic extends Course
{
	void start()
	{
		System.out.println("start the couse of Basic");
	}
	void end()
	{
		System.out.println("end the course of Basic");
	}
}
	class Dbda extends Course
	{
		void start()
		{
			System.out.println("start the couse of mscit");
		}
		void end()
		{
			System.out.println("end the course of Basic");
		}
		void orientation()
		{
			System.out.println("orientaion course");
		}
   }
	



public class CourseDemo {
static	void perform(Course ref)
	{
	if(ref instanceof Dbda)
	{
		Dbda obj=(Dbda)ref;
		obj.orientation();
	}
	ref.start();
	ref.end();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    perform(new Mscit());
    perform(new Basic());
    perform(new Dbda());
      
	}

}
