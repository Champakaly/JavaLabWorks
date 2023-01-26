package cie;
import java.util.Scanner;
public class student
{
  public String usn= new String();
  public String name= new String();
  public int sem;
  public void accept()
  {
     Scanner ss= new Scanner(System.in);
     System.out.println("Enter your USN: ");
     usn=ss.next();
     System.out.println("Enter your name: ");
     name=ss.next();
     System.out.println("Enter your semester: ");
     sem=ss.nextInt();
  }
}

package cie;
import java.util.Scanner;
public class internals extends student
{
  public int cmarks[]= new int[5];
  public int i;
  public void accept1()
  {
    Scanner ss=new Scanner(System.in);
    System.out.println("Enter your CIE marks of 5 subjects: ");
    for(i=0; i<5; i++)
    {
      cmarks[i]=ss.nextInt();
    }
  }
}

package see;
import cie.internals;
import java.util.Scanner;
public class externals extends internals
{
  public int smarks[]=new int[5];
  public int j;
  public void accept2(){
  Scanner ss=new Scanner(System.in);
  System.out.println("Enter your SEE marks of 5 subjects: ");
  for(j=0;j<5;j++)
  {
    smarks[j]=ss.nextInt();
  }
}
  public String toString()
  {
    String s="USN: "+usn+"\nName: "+name+"\nSem: "+sem;
    return s;
  }
}

import cie.student;
import cie.internals;
import see.externals;
import java.util.Scanner;
public class finalmarks
{
  public static void main(String XX[])
  {
    int studs, k,f;
    int fmarks[]=new int[5];
    Scanner s1= new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    studs=s1.nextInt();
    externals e[]= new externals[studs];
    System.out.println("Enter both cie and see marks out of 50");
    for(k=0; k<studs; k++)
    {
      e[k]=new externals();
      e[k].accept();
      e[k].accept1();
      e[k].accept2();
      for(f=0;f<5;f++)
        fmarks[f]=e[k].cmarks[f]+e[k].smarks[f];
      System.out.println("Student "+(k+1)+" details: ");
      System.out.println(e[k]);
      for(f=0;f<5;f++)
       System.out.println("\nFinal Marks: "+fmarks[f]);
    }
  }
}
