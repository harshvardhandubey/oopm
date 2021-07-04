class T1Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if(i%2==1)
			System.out.println("Thread A :"+i);
		}
	}
}

class T2Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)		
		{
			if(i%2==0)
			{
				System.out.println("Thread B :"+i);
			}
		}
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		T1Demo T1=new T1Demo();
		T1.start();
		T2Demo T2=new T2Demo();
		T2.start();
	}
}
