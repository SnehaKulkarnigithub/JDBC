class ClassOne
{
	{
		System.out.println("Inside Instance Block-ClassOne");
	}
	/*
	classOne()
	{
	}
	*/
}
class ClassTwo extends ClassOne
{
	{
		System.out.println("Inside Instatnce Block -ClassTwo");
	}

	/*
	ClassTwo()
	{
	}
	*/
}
class Inherit7
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassTwo();
		System.out.println("Stop");
	}
}