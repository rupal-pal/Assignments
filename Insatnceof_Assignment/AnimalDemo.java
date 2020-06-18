/*create a hierarchy

				Animal

					void makeSound()
					
override "makeSound()" in all the child classes.

		Dog		Cat		Tiger
							void hunting()



write a class "AnimalDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any animal and invoke
	"makeSound()" function.

	also make sure if "Tiger" is passed , its "hunting()" method also should be called.

*/


class Animal
{
	void makeSound()
	{
		System.out.println("animal make sound");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog make sound");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat make sound");
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("Tiger make sound");
	}
	void hunting()
	{
		System.out.println("Tiger hunts");
	}
}
public class AnimalDemo {
	static public void perform(Animal ref)
	{
		if(ref instanceof Tiger)
		{
			Tiger obj=(Tiger)ref;
			obj.hunting();
		}
		ref.makeSound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       perform(new Dog());
       perform(new Cat());
       perform(new Tiger());
       
	}

}
