interface Volume
{
public void volume1(int x);
public void volume2(int x);
}
class Volumedemo implements Volume
{
	public void volume1(int x)
	{
		System.out.println("Volume of sphere :"+((4/3)*3.14F*x*x*x));
	}
	public void volume2(int x)
	{
		System.out.println("Volume of hemisphere :"+((4/3)*3.14F*x*x*x*0.5F));
	}
	public static void main(String args[])
	{
		Volumedemo v=new Volumedemo();
		v.volume1(10);
		v.volume2(10);
	}
}