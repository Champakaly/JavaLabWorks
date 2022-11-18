import java.util.Scanner;
class QuadraticEquation
{
	public static void main(String XX[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the value of the coefficients \n Enter the value of a: ");
		double a= input.nextDouble();
		System.out.println("Enter the value of b: "); 
		double b= input.nextDouble();
		System.out.println("Enter the value of c: ");
		double c=input.nextDouble(); 
		double d= b*b-4.0*a*c;
		if(a==0.0) {System.out.println("The value of a cant be 0");}
		else{
		if(d>0.0)
		{
			double r1=(-b+Math.sqrt(d))/(2.0*a);
			double r2=(-b-Math.sqrt(d))/(2.0*a); 
			System.out.println("The roots are real and distinct and are "+r1+" and "+r2);
		}
		else if(d==0.0)
		{
			double r1= -b/(2.0*a);
			System.out.println("The roots are real and equal and are "+r1+" and "+r1);
		}
		else
		{
			double r1=(-b/(2.0*a));
			double r2=(Math.sqrt(Math.abs(d))/(2.0*a));
			System.out.println("The roots are imaginary and are "+r1+" +i"+r2+" and "+r1+" -i"+r2);
		}
		}
	}
}
