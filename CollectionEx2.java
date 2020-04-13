import java.util.*;
public class CollectionEx2
{
public static void main(String [] args)
{
Vector h = new Vector();
h.add(20);
h.add(10);
h.add(50);
h.add(30);
int x= Collections.binarySearch(h,10);
System.out.println(h);
Collections.swap(h,0,1);
Collections.swap(h,2,3);

}
}
