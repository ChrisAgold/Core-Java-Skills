package reviewproblems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Create an Assessment class with a public static method named half. It should accept a number and return the number divided by two.
    //Within your Assessment class create a public static method named shout. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
    //Create an Animal class. It should have private instance properties for a name and species, and public getters and setters for both.
    //Within your Animal class, define an instance method named roar. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where $NAME is replaced with the value of the name property for that object.
    //Within your Assessment class create a public static method named removeCats. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.
    //Note that the assessment spec only requires you to have methods and classes defined, there is not any requirement for a main method. However, creating additional methods will not be counted against you, so you are highly encouraged to create a main method and write some code that tests out the code you are writing for the assessment specification. For example, if you were working on the half function, you should call that function within the main method and make sure that it returns the correct values for several test cases.

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.setName("Vishnu");
        cat.setSpecies("Felis catus");
        cat.roar();

        Animal rat = new Animal();
        rat.setName("Sophie");
        rat.setSpecies("Ratus");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(rat);

        Animal.catRemoval(animals);
        // Display how many animals we have in the list
        System.out.println("Number of animals in the list: " + animals.size());
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getSpecies());

            // Loop
//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i).getSpecies());
//            if (animals.get(i).getSpecies().equals("Felis catus")) {
//                animals.remove(i);
//                System.out.println(animals.get(i).getSpecies());
//            } else {
//                System.out.println(animals.get(i).getSpecies());
//            }
//        }
            // System.out.println(animals.toString());
        }
    }
}
