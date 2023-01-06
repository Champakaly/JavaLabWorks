import java.util.Scanner;
class BMS extends Thread
{	int i=0;
	public void run()
	{	
		for(i=0;i<5;i++){
		try{	System.out.println("BMS College of Engineering");
			sleep(10000);}
		catch(InterruptedException ie){ System.out.println("Interrupted");}}
	}
}
class CSE extends Thread
{
	int i=0;
	public void run()
	{	
		for(i=0;i<10;i++){
		try{	System.out.println("CSE");
			sleep(2000);}
		catch(InterruptedException ie){ System.out.println("Interrupted");}}
	}
	
}
class mainn
{	
	public static void main(String XX[])
{		
		BMS b1= new BMS();
		CSE c1=new CSE();
		b1.start();
		c1.start();
}
}
