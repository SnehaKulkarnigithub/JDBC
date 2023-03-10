//Multilevel Inheritance

class A
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
	
}
class C extends B
{
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}

class Demo3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		A a1=new A();
		a1.m1();
		B b1=new B();
		b1.m1();
		b1.m2();
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println("Stop");
	}
}