class A
{
	int p=10;
}

class B extends A
{
	float q=20.5f;
}
class C extends B
{
	char r='x';
}
class Demo2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		A a1=new A();
		System.out.println(a1.p);
		B b1=new B();
		System.out.println(b1.p);
		System.out.println(b1.q);
		C c1=new C();
		System.out.println(c1.p);
		System.out.println(c1.q);
		System.out.println(c1.r);
	}
}