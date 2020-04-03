class A extends Thread
{
public void run()
{
int i;
for(i=0;i<=4;i++)
System.out.println("Thread A : "+ i);
}
}
class B extends Thread
{
public void run()
{
int i;
for(i=0;i<=4;i++)
System.out.println("Thread B : "+ i);
}
}
public class ThreadEx2
{
public static void main(String args [])
{
A t1 = new A();
B t2 = new B(); 
t1.start();
t2.start();
}
}
