class This 
{
int a=552, b=998 ;
void setdata()
{
int c = 0, d = 0;
c = this.a ;
d = this.b ;
System.out.println(c + " " + d);
}
public static void main(String args[])
{
This obj1 = new This();
obj1.setdata();
}
}
