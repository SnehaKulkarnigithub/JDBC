class DemoOne
{
	static void m1()
	{
		System.out.println("Inside m1 method --DemoOne");
	}
}

class DemoTwo extends DemoOne
{
	static void m2()
	{
		System.out.println("Inside m2 method --DemoTwo");
	}
}

class Demo8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		DemoTwo dt=new DemoTwo();
		dt.m1();
		dt.m2();
		System.out.println("Stop");
	}
}