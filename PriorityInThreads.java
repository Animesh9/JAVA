class que implements Runnable 
{
public synchronized void run() 
{
System.out.println(Thread.currentThread().getName());
System.out.println("Threading is done" + Thread.currentThread().getPriority());
}
}

}
