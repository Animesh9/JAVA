class even extends Thread
{
Thread t=null;
even()
{
t=new Thread(this);
start();
}
