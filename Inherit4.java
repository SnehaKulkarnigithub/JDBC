class Parent
{
	Parent()
	{
		System.out.println("Inside Parent constructor 0 arg");
	}
	Parent(int a)
	{
		System.out.println("Inside Parent constructor 1 arg");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Inside  Child constructor");
	}
}
class Inherit4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c1=new Child();
		System.out.println("Stop");
	}
}