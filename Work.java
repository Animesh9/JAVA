class worker
{
String name="bajaj";
int s_rate= 150;
}
class daily_worker extends worker
{
void compay(int hours)
{
System.out.println(s_rate*hours);
}
}
class salaried_worker extends worker
{
void compay(int hours)
{
System.out.println(s_rate*40);
}
}
class Work
{
public static void main(String args[])
{
daily_worker k= new daily_worker();
k.compay(48);
salaried_worker j=new salaried_worker();
j.compay(48);
}
}
