class DemoOne
{
	int a=100;
}
class DemoTwo extends DemoOne
{
	float b=200.5f;
}
class DemoThree
{
	public static void main(String[] args)
	{
		DemoTwo dt=new DemoTwo();
		System.out.println(dt.a);
		System.out.println(dt.b);
	}
}