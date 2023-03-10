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
		System.out.println("Inside Child Constructor - arg 0");
	}
	Child(int a)
	{
		System.out.println("Inside Child Constructor- arg 1");
	}
}
class Inherit3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c1=new Child();
		Child c2=new Child(10);
		System.out.println("Stop");
	}
}