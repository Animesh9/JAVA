class player
{
String name;
int age;
player(String n, int a)
{name=n; age=a;}
void show()
{
System.out.println("\n");
System.out.println("Player name : "+name);
System.out.println("Age : "+age);
}
}
class cricket_player extends player
{
String type;
cricket_player(String n, String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}
