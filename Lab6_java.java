import java.util.Scanner;
class nozeroage extends Exception
{
public String toString()
{return "Age cannot be lesser than zero";}
}
class notlessthanfather extends Exception
{
public String toString()
{return "Age cannot be lesser than father";}
}
class Father
{
int age;
Father(){Scanner SS= new Scanner(System.in);
System.out.println("Enter the age of the father: ");
age=SS.nextInt();}
void checkAge() throws nozeroage
{ 
if(age<0)
{ throw new nozeroage();}
else System.out.println("The age of the father is: "+age);
}
}

class Son extends Father
{
int age1;
Son(){Scanner SS= new Scanner(System.in);
System.out.println("Enter the age of the son: ");
age1=SS.nextInt();}

void checkAge1() throws notlessthanfather, nozeroage
{ 
if(age1<0){ throw new nozeroage();}
if(age1>=age){throw new notlessthanfather();}
else System.out.println("The age of the father is: "+age+" and son is: "+age1);
}
}

class mainage
{
public static void main(String XX[])
{
Father f1= new Father();
try{ f1.checkAge(); }
catch(nozeroage ae){System.out.println(ae);}
Son s1= new Son();
try{ s1.checkAge();  s1.checkAge1(); }
catch(nozeroage ae){System.out.println(ae);}
catch(notlessthanfather ne){System.out.println(ne);}
}
}
