class Parent
{
	Parent()
	{
		System.out.println("Inside parent constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Inside Child constructor");
	}
}
class Inherit1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c = new Child();
		System.out.println("Stop");
	}
}