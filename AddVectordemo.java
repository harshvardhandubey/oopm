import java.util.Vector;
class AddVectordemo
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(3,100);
		for(int i=0;i<v.size();i++)
		{
			System.out.println("Vector elements ="+v.get(i));
		}
	}
} 