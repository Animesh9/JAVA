//Code for Cyclic Redundancy Check.
import java.util.Scanner;
class CRC
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,g[],n,d[],z[],r[],msb,i,j,k;
System.out.print("Enter no. of data bits : ");
n=sc.nextInt();
System.out.print("Enter no. of generator bits : ");
m=sc.nextInt();
d=new int[n+m];
g=new int[m];
System.out.print("Enter data bits : ");
