class Arithmetic
{
	void add(int a,int b)
	{
		System.out.println("Addition "+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtraction "+(a-b));
	}
	void mult(int a,int b)
	{
		System.out.println("Multiplication "+(a*b));
	}
	void div(int a,int b)
	{
		System.out.println("Division "+(a/b));
	}
}
class Complex extends Arithmetic
{
	void sq(int a)
	{
		System.out.println("Square "+(a*a));
	}
	void mod(int a,int b)
	{
		System.out.println("Modulus "+(a%b));
	}
}
class Arithmeticdemo
{
public static void main(String args[])
{
	Complex c1=new Complex();
	c1.add(10,20);
	c1.sub(20,10);
	c1.mult(10,10);
	c1.div(10,5);
	c1.sq(10);
	c1.mod(10,5);
}
}
 