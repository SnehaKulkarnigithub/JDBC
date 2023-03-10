class ClassOne
{
	static
	{
		System.out.println("Inside static block -ClassOne");
	}
}
class ClassTwo extends ClassOne
{
	static
	{
		System.out.println("Inside static block - ClassTwo");
	}
}
class Inherit9
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassTwo();
		System.out.println("Stop");
	}

}