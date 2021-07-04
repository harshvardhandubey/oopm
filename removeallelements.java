import java.util.Vector;
class removeallelements
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(50);
		v.add(100);
		v.add(200);
		v.add(20);
		v.add(20);
		v.add(50);
		System.out.println("Vector size ="+v.size());
		System.out.println("Last index ="+v.lastIndexOf(50));
		System.out.println("First element ="+v.firstElement());
		System.out.println("Last element ="+v.lastElement());
		v.remove(5);
		System.out.println("Vector size ="+v.size());
		v.clear();
		System.out.println("Size ="+v.size());
	}
}