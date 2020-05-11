class data
{
String name;
data(String n){ name=n; }
void disp()
{
System.out.println("_______________________________");
System.out.println("Name :"+name);
int c=0;
int len=name.length();
for(int i=0;i<len;i++)
if(name.charAt(i)=='A'||name.charAt(i)=='a')
{
c++;
System.out.println("number of occurance :"+c);
System.out.println("Possition :"+(i+1));
}

}
}
