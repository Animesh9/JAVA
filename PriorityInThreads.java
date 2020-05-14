class que implements Runnable 
{
public synchronized void run() 
{
System.out.println(Thread.currentThread().getName());
System.out.println("Threading is done" + Thread.currentThread().getPriority());
}
}
public class PriorityInThreads {
public static void main(String[] args) {
que m = new que();
Thread t1 = new Thread(m);
Thread t2 = new Thread(m);
Thread t3 = new Thread(m);
Thread t4 = new Thread(m);
Thread t5 = new Thread(m);

}
}
