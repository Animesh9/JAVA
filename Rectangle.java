/*
Create a class Rectangle. The class has attributes length and width, each of which defaults to 1.
It has member functions that calculate the perimeter and the area of the rectangle.
It has set and get functions for both length and width. 
The set functions should verify that length and width are each floating-point numbers larger than 
0.0 and less than 20.0 otherwise should throw a user defined exception. Create a more sophisticated
constructor Rectangle of the class. This class stores only the Cartesian coordinates of the four 
corners of the rectangle. The constructor calls a set function that accepts four sets of coordinates
and verifies that each of these is in the first quadrant with no single x or y coordinate larger 
than 20.0 otherwise throw an exception. The set function also verifies that the supplied coordinates
do, in fact, specify a rectangle otherwise throw an exception. Member functions calculate the length,
width, perimeter and area. The length is the larger of the two dimensions.
Include a function square that determines if the rectangle is a square.
*/
import java.util.Scanner;
class area
{
Scanner s = new Scanner(System.in);
float width, lenght, area;
area() 
{
width=1;
lenght=1;
area=0;
}
void setwidth()
{
System.out.println("Enter width of rectangle: ");
width = s.nextFloat();
if(width<0 || width>20)
{
System.out.println("You cannot enter width greater than 20 and less than 0.\nEnter Valid Input. \n");
}
}
void setlenght() 
{
System.out.println("Enter lenght of rectangle: ");
lenght = s.nextFloat();
if(lenght<0 || lenght>20)
{
System.out.println("You cannot enter lenght greater than 20 and less than 0.\nEnter Valid Input.\n");
}
}
void calculation()
{
area=width*lenght;
}
void display()
{
System.out.println("Area of rectangle according to given parameters is: " + area);
}
}
