import java.util.Scanner;
abstract class Account 
{
	String name= new String();
	int accno;
  String choice;
	double bal,dep,with,min=500,tran, ci,r,n,t, p, q;
	abstract void type(char s);
	Scanner ss= new Scanner(System.in);
	void set()
	{	
		System.out.println("Enter your account number: ");
		accno=ss.nextInt();
		System.out.println("Enter your balance: ");
		bal=ss.nextDouble();
	}
	void put()
	{
		System.out.println("Your balance is now: "+bal);
	}
}

class Cur_acct extends Account
{
	void type(char s)
	{	
		if(Character.compare(s,'c')) System.out.println("This is your current account");
	}
	double cqbdeposit()
	{
		System.out.println("Enter the amount transfered to your account: ");
		dep=ss.nextDouble();
		bal=bal+dep;
		return bal;
	}
	double cbtransfer()
	{
		System.out.println("Enter the amount to be transfered: ");
		tran=ss.nextDouble();
		if((bal-tran)<min)
		{
		System.out.println("This transaction will cost a penalty of Rs.50 as the balance will go below minimun.\nDo you want to go ahead with the transaction?Y or N");
		choice=ss.next();
		if(choice.equalsIgnoreCase("Y")) {bal=bal-tran-50;}
		
		else {System.out.println("Cancelling transaction");}
		}
		else bal=bal-tran;
		return bal;
	}
}

class Sav_acct extends Account
{
	void type(char s)
	{	
		if(Character.compare(s,'s')) System.out.println("This is your Savings account");
	}
	double deposit()
	{
		System.out.println("Enter the amount to be deposited to your account: ");
		dep=ss.nextDouble();
		bal=bal+dep;
		return bal;
	}
	double withraw()
	{
		System.out.println("Enter amount to be withdrawed: ");
		with=ss.nextDouble();
		if((bal-with)>min){bal=bal-with;}
		else{ System.out.println("Insufficient balance");}
		return bal;
	}

	double compoundintrest()
	{	
		System.out.println("Enter the intrest rate: ");
		r=ss.nextDouble();
		System.out.println("Enter number of times intrest applied per time period: ");
		n=ss.nextDouble();
		System.out.println("Enter the time period: ");
		t=ss.nextInt();
		p=(1+(r/n));
		q=n*t;
		ci= bal*Math.pow(p,q);
		bal=bal+ci;
		return bal;
	}	
}

class MainBank
{
	public static void main(String args[])
	{
	Scanner ss= new Scanner(System.in);
	System.out.println("Enter the type of account to be created\n1.Current Account\n2.Savings Account");
	int ch,k;
	char x;
	ch=ss.nextInt();
	if(ch==1)
	{	x='c';
		Cur_acct c1= new Cur_acct();
		c1.type(x);
		c1.set();
		
		System.out.println("Do you want to transfer to 1.Your account or a 2.Different account");
		k=ss.nextInt();
		if(k==1)
		c1.cqbdeposit();
		if(k==2)
		c1.cbtransfer();
		c1.put();
		
	}
	if(ch==2)
	{	x='s';
		Sav_acct s1= new Sav_acct();
		s1.type(x);
		s1.set();
		
		System.out.println("Do you want to 1.Deposit or a 2.Withdraw or get 3.Compound Intrest");
		k=ss.nextInt();
		if(k==1)
		s1.deposit();
		if(k==2)
		s1.withraw();
		if(k==3)
		s1.compoundintrest();
		s1.put();
		
	}
 }
}
