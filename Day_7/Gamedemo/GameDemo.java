package Gamedemo;

abstract class Game
{
	abstract void play();
}

class FootBall extends Game
{
	public void play()
	{
		System.out.println("Play FootBall Game");
	}
}

class Cricket extends Game
{
	public void play()
	{
		System.out.println("play Cricket Game");
	}
}

class Tennis extends Game
{
	public void play()
	{
		System.out.println("Play Tennis Game");
	}
}

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game arr[]=new Game[3];
		arr[0]=new FootBall();
		arr[1]=new Cricket();
		arr[2]=new Tennis();
		Game ref=new Cricket();
		for(int i=0;i<arr.length;i++)
		{
			//arr[2].play();
			if( ref instanceof Cricket)
			{
				Cricket obj=(Cricket)ref;
				obj.play();
				
				
			}
		}
		

	}

}
