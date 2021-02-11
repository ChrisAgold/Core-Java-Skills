package reviewproblems;
import java.util.ArrayList;
import java.util.List;

public class Animal extends Assesment {
    // Variables
    private String name;
    private String species;

    // Constructor
    public Animal() {

    }

    // Getters & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Within your Animal class, define an instance method named roar. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where $NAME is replaced with the value of the name property for that object.

    // Methods
    public void roar() {
        System.out.println("I am " + name + " hear me roar!");
    }

//    // remove cat method
//    public static ArrayList<Animal>catRemoval(ArrayList<Animal> animals) {
//        for (int i = 0; i < animals.size(); i++) {
//            if (animals.get(i).getSpecies().equals("Felis catus")) {
//                animals.remove(i);
////                System.out.println(animals.get(i).getSpecies());
//            } else {
//                // System.out.println(animals.get(i).getSpecies());
//            }
//        }
//        return animals;
//    }
}