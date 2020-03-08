import java.util.Scanner;

abstract class Animals
{
String name; 
int age;
String type;
Animals(String name , int age , String type)
{
this.name = name;
this.age = age;
this.type  = type;
}
String getName(String name)
{
return name;
}
int getAge(int age)
{
return age;
}
void talk()
{
System.out.println("Name " + name + "\nAge " + age + "\nType " + type);
}
}
