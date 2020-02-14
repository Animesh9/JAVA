class worker
{
String n;
int no;
worker(String n, int no){
this.n=n;
this.no=no;
}
void show()
{
System.out.println("Employee Number :-"+ no );
System.out.println("Employee Name :-"+ n );
}
}
class dailyworker extends worker
{
int r ;
dailyworker(String n, int no, int r){
super(n, no);
this.r=r;}
void company (int h)
{
show();
System.out.println("Salary :-"+r*h );
}
}
class salariedworker extends worker
{
int r ;
salariedworker(String n,int no,int r)
{
super(n,no);
this.r=r;
}
int hour = 40;
void company()
{
show();
System.out.println("Salary :-"+ r*hour );
}
}
