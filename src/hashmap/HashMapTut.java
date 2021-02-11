package hashmap;
import java.util.HashMap;
public class HashMapTut {
    public static void main(String[] args) {

//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a", 10);
//        happy.put("b", 3);
//        happy.put("c", 88);
//        System.out.println(happy.get("c"));

        // User & Password Hashmap
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("Bobjoe1996", "FluffyCat");
        fun.put("hellolKitty", "BorkInvestInDOgeCoin");
        fun.put("Jimmy76", "passsword123");

        // remove
        // fun.remove("hellolKitty");
        // see if hashmap contains a value
        // System.out.println(fun.containsValue("BorkInvestInDOgeCoin"));
        // get size of hashmap
        // System.out.println(fun.size());
        // replace
//        System.out.println(fun.replace("hellolKitty", "DOGE"));
//        System.out.println(fun);
        // get only values
        // System.out.println(fun.values());
        // only keys
        System.out.println(fun.keySet());
    }
}
