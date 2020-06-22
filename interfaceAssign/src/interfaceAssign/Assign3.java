/*9) create interface "Game" , have an abstract method "play()". from this interface implements 
 * classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.
inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. 
Call "perform()" method from main function.

*/



package interfaceAssign;
interface Game
{
	abstract void Play();
}
class Cricket implements Game
{
	 public void Play()
	 {
		 System.out.println("THIS IS A CRICKET GAME");
	 }
	 public void abtGame()
	 {
		 System.out.println("INFORMATION ABOUT CRICKET GAME");
	 }
}
class FootBall implements Game
{
	 public void Play()
	 {
		 System.out.println("THIS IS A FOOTBALL GAME");
	 }
	
}
class Tennis implements Game
{
	 public void Play()
	 {
		 System.out.println("THIS IS A TENNIS GAME");
	 }
	
}

public class Assign3 {
	static void Perform(Game ref)
	{
		if(ref instanceof Cricket)
		{
			Cricket obj=(Cricket)ref;
			obj.abtGame();
		}
		ref.Play();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Perform(new Cricket());
	Perform(new FootBall());
	Perform(new Tennis());
		
	}

}
