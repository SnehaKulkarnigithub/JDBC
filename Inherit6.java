class Parent
{
	Parent()
	{
		System.out.println("Inside 0 arg const-Parent");
	}

	Parent(int a)
	{
		this();
		System.out.println("Inside 1 argm const-Parent");
	}
}
class Child extends Parent
{
	Child()
	{
		this(10);
		System.out.println("Inside 0 argm const-Child");
	}
	Child(int a)
	{
		super(10);
		System.out.println("Inside 1 argm const -Child");
	}
}
class Inherit6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Child();
		System.out.println("Stop");
	}
}