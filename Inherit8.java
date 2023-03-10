class ClassOne
{
	{
		System.out.println("Inside Instance Block - ClassOne");
	}
	ClassOne()
	{
		System.out.println("Inside constructor - ClassOne");
	}
}

class ClassTwo extends ClassOne
{
	{
		System.out.println("Inside Instance Block - ClassTwo");
	}
	ClassTwo()
	{
		System.out.println("Inside Constructor - ClassTwo");
	}
}
class Inherit8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassTwo();
		System.out.println("Stop");
	}
}