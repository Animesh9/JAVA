import java.util.Scanner;
class Account
{
private int bal;
public Account(int bal)
{this.bal=bal;}
public boolean isSufbal(int w)
{
if (bal>w)
return(true);
else
return(false);
}
public void withdraw(int amt)
{
bal=bal-amt;
System.out.println("Withdrawl mone is "+amt);
System.out.println("Your current balance is "+bal);
}
}
class Customer implements Runnable
{
private String name;
private Account account ;
public Customer (Account account , String name)
{this.account=account;
this.name = name; 
}
public void run()
{
Scanner s= new Scanner(System.in);
synchronized(account){
System.out.println(name + ",Enter amount to withdraw ");
int amt = s.nextInt();
if(account.isSufbal(amt))
{
System.out.println(name);
account.withdraw(amt);
}
else
System.out.println("Insufficient Balance");
}
}
}
public class ThreadUsingSynchronization
{
public static void main (String args[])
{
Account a1 = new Account(1000);
Customer c1 = new Customer(a1,"Ani") , c2 = new Customer(a1,"Animesh");
Thread t1 = new Thread(c1);
Thread t2 = new Thread(c2);
t1.start();
t2.start();
}
}
