import java.util.Scanner;
class methods{
String USN;
String name;
int[] credits= new int[9];
int[] marks= new int[9];
int i=0;
int gp;
double sgpa;
void accept(){

Scanner SS= new Scanner(System.in);
System.out.println("Enter your USN and name");
USN= SS.next();
name= SS.next();
for(i=0; i<9; i++){System.out.println("Enter marks for subject "+(i+1)+":");
marks[i]= SS.nextInt();}
for(i=0; i<9; i++){System.out.println("Enter credits for subject "+(i+1)+":");
credits[i]= SS.nextInt();}
}
void display(){

System.out.println("USN: "+USN+"\nName :"+name+"\n");
for(i=0;i<9;i++){System.out.println("Marks: "+marks[i]+" Credits: "+credits[i]+"\n");}
}
void gradepoint(){
for(i=0;i<9;i++){
if(marks[i]>=90 &&marks[i]<=100) gp=10;
else if(marks[i]>=80 &&marks[i]<=89) gp=9;
else if(marks[i]>=70 &&marks[i]<=79) gp=8;
else if(marks[i]>=60 &&marks[i]<=69) gp=7;
else if(marks[i]>=55 &&marks[i]<=59) gp=6;
else if(marks[i]>=50 &&marks[i]<=54) gp=5;
else if(marks[i]>=40 &&marks[i]<=49) gp=4;
else { gp=0;System.out.println("Subject failed"); }
sgpa=sgpa+(credits[i]*gp);}
sgpa=sgpa/20;
System.out.println("Your sgpa is: "+sgpa);
}
}
class main{
public static void main(String S[]){
methods m= new methods();
m.accept();
m.display();
m.gradepoint();
}}
