class ClassOne
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class ClassTwo extends ClassOne
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		ClassTwo ct=new ClassTwo();
		ct.m1();
		ct.m2();
		System.out.println("Stop");
	}
	
}