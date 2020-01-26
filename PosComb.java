package in.javadomain;
immport java.util.Scanner;
public class PosComb{
public static void main(String args[])
{
Scanner pc = new Scanner(System.in);
int a[] = new  int[3] ;
System.out.println("Enter any 3 numbers from o-9");
for (int i=0; i<3; i++)
a[i] = pc.nextInt();

for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++) 
{
for (int z = 0; z < 3; z++) 
{
if (x != y && y != z && z != x) 
{
System.out.println(a[x] + "" + a[y] + ""+ a[z]);
}
}
}
}
}
} 
