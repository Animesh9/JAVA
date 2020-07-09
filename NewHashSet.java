import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class NewHashSet
{
    public static void main(String agr[])
    {
        List names = new ArrayList<String>();
        names.add("Animesh");
        names.add("Ani");
        names.add("Kush");
        names.add("Roman");
        names.add("Chirag");
        HashSet hNames = new HashSet<>(names);
        System.out.println("Initial list :"+hNames);  
        String key = "Ani";
        System.out.println("Contains key '" + key+ "' ? :" + hNames.contains(key));
        hNames.clear();
        System.out.println("After clear() list :"+hNames);  
    }
}
