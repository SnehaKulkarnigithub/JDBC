class Parent
{
	Parent()
	{
		System.out.println("Inside Parent Constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		this(10);
		System.out.println("Inside Child constructor - 0arg");
	}
	Child(int a)
	{
		System.out.println("Inside Child constructor - 1 arg");
	}
}
class Inherit5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c1=new Child();
		System.out.println("Stop");
	}
}