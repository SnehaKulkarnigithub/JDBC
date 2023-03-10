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
		System.out.println("Inside Child Consrtuctor");
	}
}
class Inherit2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c=new Child();
		System.out.println("Stop");
	}
}