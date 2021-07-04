import java.util.Vector;
class Removevector
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(20);
		v.add(50);
v.add(4,90);
		v.remove(3);


		//System.out.println("Removed element"+v.remove(2));

		for(int i=0;i<v.size();i++)
		{
			System.out.println("Vector elements :"+v.get(i));
		}
	}
}