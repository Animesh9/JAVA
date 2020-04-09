public class GenericMethod
{
public <A> void printArray(A []s)
{
for (A x:s)
System.out.println(x);
}
public static void main(String args[])
{
GenericMethod gm1 = new GenericMethod();

}
}
