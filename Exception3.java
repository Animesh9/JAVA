import java.util.*;
class Exception3{
public static void main(String[] args) {
int x,y;
try{
x = Integer.parseInt(args[0]);
y = Integer.parseInt(args[1]);
}    
catch(NumberFormatException e){
System.out.println("Not an Integer!");
}
}
}
