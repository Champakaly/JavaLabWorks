import java.util.Scanner;
abstract class Shape
{
	int a, b;
	abstract void printArea();
	void set()
	{
		Scanner SS= new Scanner(System.in);
		System.out.println("Enter The height and breadth: ");
		a=SS.nextInt();
		b=SS.nextInt();	
	}
}
class Rectangle extends Shape
{
	void printArea(){
		System.out.println("The area of Rectangle is: "+(a*b));
	}	
}
class Triangle extends Shape
{
	void printArea(){
		System.out.println("The area of Triangle is: "+(a*b*1/2));
	}
}
class Circle extends Shape
{
	void printArea()
	{
		Scanner SS= new Scanner(System.in);
		System.out.println("Enter the radius: ");
		a=SS.nextInt();
		System.out.println("The area of Circle is: "+(3.14*a*a));
}
	}
class Main_Abstract
{
	public static void main(String XX[])
	{
		Rectangle R1= new Rectangle();
		R1.set();
		R1.printArea();
		Triangle T1= new Triangle();
		T1.set();
		T1.printArea();
		Circle C1= new Circle();
		C1.printArea();
	}
}
