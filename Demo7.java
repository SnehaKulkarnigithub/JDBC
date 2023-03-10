class DemoOne
{
	void m1()
	{
		System.out.println("Inside m1 method -DemoOne");
	}
}
class DemoTwo extends DemoOne
{
	void m1()
	{
		System.out.println("Inside m1 method -DemoTwo");
	}
	void test()
	{
		System.out.println("Inside Test method -DemoTwo");
		this.m1();
		super.m1();
	}
}
class Demo7
{
	public static void main(String[] args)
	{
		DemoTwo dt=new DemoTwo();
		dt.test();
	}
}