// ASSIGNMENT QUESTION
/*Create the abstract class Animal and a set of two or three animal sub-classes such as   
        Tiger  
 	and Lion. Details for Animal class is-  o String getName() - which returns the name of the animal.  o int getAge() - which returns the age in years.  
o	void talk() - which causes the animal to display on the screen their name, age and   	 	 	     what type of animal they are.  
 
 Create a Zoo class containing an array of references to animals with the functionality below- 
 
The Zoo provides the following methods :-  o addAnimal(Animal newAnimal) - which adds a new animal to the Zoo.  o displayAnimals() - which displays a list of the type and name of all animals   	 	 	 	 	    in the zoo.  
ovoid feedingTime() - which causes all animals in the zoo to talk one after the other.  
 The main  class has following functionalities-  
Add a new animal to the zoo - first prompting for name and type and creating the animal.  
Display all animals currently in the zoo.  
Display the name and age of the animal in a selected type. 
Trigger feeding time.  
Implement a menu-driven main program which uses the Zoo and the various animal classes and test it. 
*/

import java.util.Scanner;
abstract class Animals
{
        String name; 
        int age;
        String type;
        Animals(String name , int age , String type)
        {
                this.name = name;
                this.age = age;
                this.type  = type;
        }
        String getName(String name)
        {
                return name;
        }
        int getAge(int age)
        {
                return age;
        }
        void talk()
        {
                System.out.println("Name " + name + "\nAge " + age + "\nType " + type);
        }
}
class Lion extends Animals
{
        Lion(String name , int age , String type)
        {
                super(name,age,type);
                super.talk();
        }
}
class Tiger extends Animals
{
        Tiger(String name,int age,String type)
        {
                super(name,age,type);
                super.talk();
        }
}
class Zoo 
{
        public static void main(String args [])
        {
                Scanner s = new Scanner(System.in);
                char input;
                Lion l1 = new Lion("Lion" , 4 ,"Lion");
                Tiger t1 = new Tiger ("Tiger" , 4 ,"Omnivores");
                do
                {
                        String name = s.nextLine();
                        int age = s.nextInt();
                        String type = s.nextLine();
                        Lion l2 = new Lion( name ,age  , type );
                        System.out.println("Add Animal ") ;
                        input = s.next().charAt(0);
                }while (input == 'y');

        }
}
//This Question is Incomplete feel free to change ....

