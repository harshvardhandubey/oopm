class A
{
	void display()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Class B");
	}
}
class C extends B
{
	void display()
	{
		System.out.println("Class C");
	}
}
class Ademo 
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.display();
		C obj1=new B();
		obj1.display();
		C obj2=new A();
		obj2.display();
	}
} 	