import java.util.*;
public class CollectionEx1
{
  public static void main(String [] args)
  {
    Vector h = new Vector();
    h.add(20);
    h.add(10);
    h.add(60);
    h.add(40);
    int x= Collections.binarySearch(h,10);
    System.out.println(h);
    Collection.sort(h);
    System.out.println(h);
    System.out.println(x);
  }
}
