class A implements Runnable
{
public void run()
{
int i;
for(i=0;i<=4;i++)
System.out.println("Thread A : "+ i);
}
}
class B implements Runnable
{
public void run()
{
int i;
for(i=0;i<=4;i++)
System.out.println("Thread B : "+ i);
}
}
