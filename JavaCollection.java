import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class JavaCollection
{
public static void main(String args[])
{
List names = new ArrayList<String>();
names.add("Animesh");
names.add("Ani");
names.add("Kush");
names.add("Roman");
List Dnames = new ArrayList<String>();
Dnames = names;
Collections.reverse(names);
Iterator IDnames = Dnames.iterator();
System.out.println("Actual list OR Duplicated list :");			
while(IDnames.hasNext()){
System.out.println(IDnames.next());			
}

}
}
