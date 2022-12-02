import java.util.Scanner;
class book{
String author;
String name;
int price;
int num_pages;
book(){}
book(String n, String a, int p, int num){
name= n;
author=a;
price=p;
num_pages=num;
}

void getd(){
Scanner ss= new Scanner(System.in);
System.out.println("Enter the name of the book: ");
name=ss.next();
System.out.println("Enter the author of the book: ");
author=ss.next();
System.out.println("Enter the price of the book: ");
price=ss.nextInt();
System.out.println("Enter the number of pages of the book: ");
num_pages=ss.nextInt();

}


public String toString(){
String S= "Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of pages: "+num_pages;
return S;
}
}

class main{
public static void main(String XX[]){
int x;
Scanner ss= new Scanner(System.in);
System.out.println("How many books do you want to store?");
x=ss.nextInt();
book b[]= new book[x];
for(int i=0; i<x;i++){
b[i]=new book();
  System.out.println("Enter book "+(i+1)+" details: ");
b[i].getd();
        }


 for(int i=0; i<x; i++)
        {
            System.out.println("Book "+(i+1)+" details:");
            System.out.println(b[i]);
        }
    }
}
