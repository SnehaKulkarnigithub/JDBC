//Herarchial Inheritance

class A
{
	void m1()
		{
		System.out.println("Inside m1");
		}
}
class B extends A
{
	void m2()
		{
		System.out.println("Inside m2");
		}
}
class C extends A
{
	void m3()
		{
		System.out.println("Inside m3");
		}
}
class D extends A
{
	void m4()
		{
		System.out.println("Inside m4");
		}
}

class Demo4
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
		c1.m3();
		D d1=new D();
		d1.m1();
		d1.m4();
		System.out.println("Stop");
	}
}