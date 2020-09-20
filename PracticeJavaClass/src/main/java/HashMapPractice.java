import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> cars = new HashMap<>();

        cars.put("Mercedes", 300);
        cars.put("Lexus", 250);
        cars.put("Audi", 4);
        cars.put("BMW", 320);
//      cars.put("BMW", 400);

        System.out.println(cars);
    }
}


//        List<HashMap<String, Integer>> ListCeption = new ArrayList<>();
//        ListCeption.add(cars);
//
//        System.out.println(cars);
//
//        HashMap<String, List<HashMap<String, Integer>>> Holy = new HashMap<>();
//        Holy.put("Expensive", ListCeption);
//
//        //Fucking Nested Hashmap. Holy shit man.
//
//        System.out.println(Holy);
//
//
//        //Hashmaps only take one unique Key value (The variable on the left).
//
//
