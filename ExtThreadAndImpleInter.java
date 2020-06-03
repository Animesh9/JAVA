class test
{
  public static void t1()
  {
    System.out.println("In test class ");
  }
}
class ExtThreadAndImpleInter extends test implements Runnable
{
  public void run()
  {
    System.out.println("Child method to be executed by child thread");
  }
public static void main(String [] args)
{
ExtThreadAndImpleInter a = new ExtThreadAndImpleInter();
a.t1();
Thread t2 = new Thread(a);
t2.start();
System.out.println("Main method executed by main thread");
}
}
