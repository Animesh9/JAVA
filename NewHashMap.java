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

}  
} 
} 
