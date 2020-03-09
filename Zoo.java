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
class Lion extends Animals
{
Lion(String name , int age , String type)
{
super(name,age,type);
super.talk();
}
}
class Tiger extends Animals
{
Tiger(String name,int age,String type)
{
super(name,age,type);
super.talk();
}
}
class Zoo 
{
public static void main(String args [])
{
Scanner s = new Scanner(System.in);
char input;
Lion l1 = new Lion("Lion" , 4 ,"Lion");
Tiger t1 = new Tiger ("Tiger" , 4 ,"Omnivores");
do
{
String name = s.nextLine();
int age = s.nextInt();
String type = s.nextLine();
Lion l2 = new Lion( name ,age  , type );
System.out.println("Add Animal ") ;
input = s.next().charAt(0);
}while (input == 'y');
}
}
