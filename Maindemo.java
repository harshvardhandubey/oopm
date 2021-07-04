class A
{
	void displayA()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void displayB()
	{
		System.out.println("Class B");
	}
}
class C extends A
{
	void displayC()
	{
		System.out.println("Class C");
	}
}
class Maindemo
{
public static void main(String args[])
{
B obj=new B();
B obj1=new B();
C obj2=new C();
obj.displayA();
obj1.displayB();
obj2.displayC();
}
}