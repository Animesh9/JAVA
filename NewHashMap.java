import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class NewHashMap
{
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("Animesh", 10); 
        map.put("Ani", 30); 
        map.put("Roman", 20);
        map.put("Kush", 20);
        System.out.println();
        String key = "Animesh";
        if (map.containsKey(key)) 
        {
            Integer a = map.get(key); 
            System.out.println("value for key "+ key  +" is: "+a); 
        }
        int value = 20; 
        System.out.println();
        if (map.containsValue(value)) 
        {
            Iterator it = map.entrySet().iterator();
            while(it.hasNext()){ 
            String str = it.next().toString();
            if(str.split("=")[1].contains(String.valueOf(value)))
            {
                System.out.println("key for value "+ value  +" is: "+str.split("=")[0]); 
            }
        }
    } 
    System.out.println();
    System.out.println("Printing as key set :");
    Iterator it = map.keySet().iterator();
    while(it.hasNext())
    { 
        System.out.println(it.next().toString());
    }
    System.out.println();
    System.out.println("Printing as entry set :");
    it = map.entrySet().iterator();
    while(it.hasNext())
    {
        System.out.println(it.next().toString());
    }
if (map.isEmpty()) 
{ 
System.out.println("map is empty"); 
} 
else 
{ 
System.out.println(map);
}  
} 
} 
