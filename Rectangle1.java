 interface Shape
{
public void area(int l,int b);
public void perimeter(int l,int b);
}
class Rectangle1 implements Shape
{
	public void area(int l,int b)
	{
		System.out.println("Area of rectangle :"+(l*b));
	}
	public void perimeter(int l,int b)
	{
		System.out.println("Perimeter of rectangle :"+2*(l+b));
	}

	public static void main(String args[])
	{
		Rectangle1 r=new Rectangle1();
		r.area(10,20);
		r.perimeter(10,20);
	}
}