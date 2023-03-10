class ClassOne
{
	ClassOne()
	{
		System.out.println("Inside Constructor - ClassOne");
	}
}
class ClassTwo extends ClassOne
{
	ClassTwo()
	{
		System.out.println("Inside Constructor - ClassTwo");
	}
}
class Inherit
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassTwo();
		System.out.println("Stop");
	}
}