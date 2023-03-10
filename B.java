//parent
class A
{
int x=100;
}
//child
class B extends A
{
float y=200.5f;

public static void main(String[] args)
	{
	System.out.println("Start");
	//parent object
	A a1=new A();
	System.out.println("The value of x is "+a1.x);
	//child object
	B b1=new B();
	System.out.println("The value of x is "+b1.x);
	System.out.println("The value of y is "+b1.y);
	System.out.println("Stop");
	}
}
