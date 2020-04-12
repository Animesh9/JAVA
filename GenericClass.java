class Data<A>
{
A i;
public void add(A i1)
{
i=i1;
}
public A get()
{
return(i);
}
}
public class GenericClass
{
public static void main(String args[])
{
Data<Integer> g1 = new Data<Integer>();
Data<String> g2 = new Data<String>();
Integer k = new Integer(5);
g1.add(k);
g2.add("Animesh");
System.out.println("g1 = " +g1.get() +"\ng2 = "+g2.get());
}
}
