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

}
