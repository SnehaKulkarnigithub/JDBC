class DemoOne
{
	int a=1000;
	float b=2000.5f;
}
class DemoTwo extends DemoOne	
{
	int a=100;
	float b=200.5f;
	void m1(int a, float b)
	{
		System.out.println("Inside m1 method");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
}
class Demo6
{
	public static void main(String[] args)
	{
		DemoTwo dt=new DemoTwo();
		dt.m1(10,20.5f);
	}
}