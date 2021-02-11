package reviewproblems;
import java.util.ArrayList;

public class Assesment {




    // Method //
    public static int half(int num) {
        return num / 2;
    }

    public static String shout(String word) {
        return word.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {
        System.out.println(half(34));
        System.out.println(shout("Hello"));

    }

    // remove cat method
    public static ArrayList<Animal>catRemoval(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getSpecies().equals("Felis catus")) {
                animals.remove(i);
//                System.out.println(animals.get(i).getSpecies());
            }  // System.out.println(animals.get(i).getSpecies());
        }
        return animals;
    }
}