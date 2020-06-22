package assignday2;
interface Vechicle
{
	void start();
}
class twowheeler implements Vechicle
{
	public void start()
	{
		System.out.println("Start a two wheeler");
	}
}
class threewheeler implements Vechicle
{
	public void start()
	{
		System.out.println("Start a three wheeler");
	}
}
class fourwheeler implements Vechicle
{
	public void start()
	{
		System.out.println("Start a  four wheeler");
	}
}

public class VDemo {
	static void perform(Vechicle ref)
	{
		ref.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new twowheeler());
		perform(new threewheeler());
		perform(new fourwheeler());
	}

}
