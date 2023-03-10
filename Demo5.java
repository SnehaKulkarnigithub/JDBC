class A
{
	int x=100;
}
class B extends A
{
	float y=200.5f;
}
class C extends A
{
	char z='a';
}
class D extends A
{
	boolean p=true;
}
class Demo5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		A a1=new A();
		System.out.println(a1.x);
		B b1=new B();
		System.out.println(b1.x);
		System.out.println(b1.y);
		C c1=new C();
		System.out.println(c1.x);
		System.out.println(c1.z);
		D d1=new D();
		System.out.println(d1.x);

		System.out.println(d1.p);
		System.out.println("Stop");

	}
}