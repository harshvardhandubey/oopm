class Box
{
int a,b;
Box(int a,int b)
{
this.a=a;
this.b=b;
}
void area1()
{
System.out.println("Area =" +(a*a));
}
}
class Rectangle extends Box{
Rectangle(int a,int b)
{
super(a,b);
}
void area2()
{
System.out.println("Area =" +(a*b));
}
}
class BoxTest
{
public static void main(String args[])
{
Rectangle ob=new Rectangle(10,20);
ob.area1();
ob.area2();
}
}
