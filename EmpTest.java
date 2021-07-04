import java.util.Scanner;
class Emp
{
	int[] id = new int[10];
	int[] sal = new int[10];
	String[] name = new String[10];	
	int j;
	Emp() {}
Emp(int eid,String ename,int esal,int i)
	{
	id[i]=eid;
	name[i]=ename;
	sal[i]=esal;
	}
	
	void display(int n)
	{
	System.out.print("\tEmployee Details\t\n");
System.out.print("Id :" + id[n]+"\t"+"Name : "+name[n]+"\t"+"Sal : "+ sal[n]+"\t\n");
}
}
class EmpTest{	
public static void main(String args[])
	{
int i;
		int[] id = new int[10];
		int[] sal = new int[10];
		String[] name = new String[10];	
		Emp[] e = new Emp[10];
		Scanner s = new Scanner(System.in);
		for(i=0;i<3;i++)
		{
		System.out.println("\nEnter Id");
		id[i]=s.nextInt();
		System.out.println("Enter Name");
		name[i]=s.next();
		System.out.println("Enter Salary");
		sal[i]=s.nextInt();
		}
		for(i=0;i<3;i++)
		{
		e[i] = new Emp(id[i],name[i],sal[i],i);
e[i].display(i);  }
}
}
