class ClassOne
{
	static
	{
		System.out.println("Inside static block - ClassOne");
	}
	ClassOne()
	{
		System.out.println("Inside Constructor - ClassOne");
	}
}
class ClassTwo extends ClassOne
{
	static
	{
		System.out.println("Inside static block - classTwo");
	}
	ClassTwo()
	{
		System.out.println("Inside Constructor - classTwo");
	}
}
class Inherit10
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassTwo();
		System.out.println("Stop");
	}
}