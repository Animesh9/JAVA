import java.util.Scanner;
public class SelectionSort
{
public static void main (String args[])
{
int n, k;
int t=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Number of elements in array");
n = s.nextInt();
int [] i = new int[n];
for (k=0;k<n;k++)
{
i[k]=s.nextInt();
}
for (k=0;k<n-1;k++)
{
for (int j = k + 1 ; j < n ; j++)
{
if(i[k]>i[j])
{
t=i[k];
i[k]=i[j];
i[j]=t;
}
}
}
for (k=0;k<n;k++)
{
System.out.println(i[k]+" ,");
}

}
}
