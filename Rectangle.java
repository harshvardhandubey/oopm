class Box
{
	void volume()
	{
		int l=10,b=15,h=10;
		System.out.println("Volume ="+(l*b*h));
	}
}
class Rectangle extends Box
{
	void volume()
	{
		int l=30,b=20,h=10;
		System.out.println("Volume ="+(l*b*h));
		super.volume();
	}
public static void main(String args[])
{
	Rectangle R1=new Rectangle();
	R1.volume();
}
}                                                                                                                                                                              