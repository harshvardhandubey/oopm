import java.util.Vector;
class Enumeration
{
	public static void main(String args[])
	{
		Vector v=new Vector(2);
		System.out.println("Size ="+v.size());
		System.out.println("Capacity ="+v.capacity());
		v.addElement("OOPM");
		v.addElement("ADC");
		v.addElement("PADC");
		System.out.println("Size ="+v.size());
		System.out.println("Capacity ="+v.capacity());
		v.addElement("DSA");
		v.addElement("AM3");
		v.addElement("DBMS");
		System.out.println("Size ="+v.size());
		System.out.println("Capacity ="+v.capacity());
		for(int i=0;i<v.size();i++)
		{
		System.out.println("Vector elements :"+v.get(i));
		}
	}
}