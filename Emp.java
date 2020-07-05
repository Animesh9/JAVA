import java.util.*;
class employee
{
    String name;
    int empid;
    int salary;
    employee()
    {
        name="bajaj";
        empid=67;
        salary=9000;
    }
    employee(String n,int e,int s)
    {
        name=n;
        empid=e;
        salary=s;
    }
String no()
{
return name;
}
int fo()
{
return salary;
}
double increaseSalary(double per_in)
{
double in=(salary*(per_in/100));
double s=salary+in;
return s;
}
}
class manager extends employee
{
public String department="d";

}
class Emp
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the name");
String n=sc.next();
System.out.println("enter the employee id");
int e=sc.nextInt();
System.out.println("enter the salary");
int s=sc.nextInt();
System.out.println("enter the percentage_rate increaced in salary");
double p=sc.nextDouble();
employee m=new employee(n,e,s);
System.out.println(m.no());
System.out.println(m.fo());
System.out.println(m.increaseSalary(6));
}
}
