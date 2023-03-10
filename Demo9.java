class DemoOne
{
	static int a=1000;
	static float b=2000.5f;
}
class DemoTwo extends DemoOne
{
	static int a=100;
	static float b=200.5f;

	void test(int a, float b)
	{
		System.out.println("Inside m1 method DemoTwo");
		System.out.println(a+b);
		System.out.println(DemoTwo.a+DemoTwo.b);
		System.out.println(DemoOne.a+DemoOne.b);
	}
}
class Demo9
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		DemoTwo dt=new DemoTwo();
		dt.test(10,20.5f);
		System.out.println("Stop");
	}
}
